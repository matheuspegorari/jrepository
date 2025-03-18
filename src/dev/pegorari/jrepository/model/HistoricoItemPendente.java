package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoItemPendente extends AbstractSankhyaEntity<HistoricoItemPendente> {
   private BigDecimal seqHip;
   private String descricao;
   private String status;
   private BigDecimal nuNota;
   private BigDecimal sequencia;
   private BigDecimal codUsu;
   private Timestamp dhAlter;

   public BigDecimal getSeqHip() {
        return seqHip;
   }

   public void setSeqHip(BigDecimal seqHip) {
        markAsChanged("SEQHIP", seqHip);
        this.seqHip = seqHip;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   @Override
   public String getTableName() {
        return "TGFHIP";
   }

   @Override
   public String getEntityName() {
        return "HistoricoItemPendente";
   }

   @Override
   public HistoricoItemPendente fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.seqHip = vo.asBigDecimal("SEQHIP");
        this.descricao = vo.asString("DESCRICAO");
        this.status = vo.asString("STATUS");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        return this;
   }
}
