package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AdicoesImportacao extends AbstractSankhyaEntity<AdicoesImportacao> {
   private String codFabricante;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private BigDecimal nroAdicao;
   private BigDecimal nuNota;
   private BigDecimal seqAd;
   private BigDecimal seqDi;
   private BigDecimal sequencia;
   private BigDecimal vlrDesc;

   public String getCodFabricante() {
        return codFabricante;
   }

   public void setCodFabricante(String codFabricante) {
        markAsChanged("CODFABRICANTE", codFabricante);
        this.codFabricante = codFabricante;
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

   public BigDecimal getNroAdicao() {
        return nroAdicao;
   }

   public void setNroAdicao(BigDecimal nroAdicao) {
        markAsChanged("NROADICAO", nroAdicao);
        this.nroAdicao = nroAdicao;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getSeqAd() {
        return seqAd;
   }

   public void setSeqAd(BigDecimal seqAd) {
        markAsChanged("SEQAD", seqAd);
        this.seqAd = seqAd;
   }

   public BigDecimal getSeqDi() {
        return seqDi;
   }

   public void setSeqDi(BigDecimal seqDi) {
        markAsChanged("SEQDI", seqDi);
        this.seqDi = seqDi;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getVlrDesc() {
        return vlrDesc;
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
        this.vlrDesc = vlrDesc;
   }

   @Override
   public String getTableName() {
        return "TGFIAD";
   }

   @Override
   public String getEntityName() {
        return "AdicoesImportacao";
   }

   @Override
   public AdicoesImportacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codFabricante = vo.asString("CODFABRICANTE");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nroAdicao = vo.asBigDecimal("NROADICAO");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.seqAd = vo.asBigDecimal("SEQAD");
        this.seqDi = vo.asBigDecimal("SEQDI");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.vlrDesc = vo.asBigDecimal("VLRDESC");
        return this;
   }
}
