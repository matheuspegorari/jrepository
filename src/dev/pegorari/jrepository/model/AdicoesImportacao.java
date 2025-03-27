package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AdicoesImportacao extends AbstractSankhyaEntity<AdicoesImportacao> {
   public String getCodFabricante() {
        return this.getVo().asString("CODFABRICANTE");
   }

   public void setCodFabricante(String codFabricante) {
        markAsChanged("CODFABRICANTE", codFabricante);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNroAdicao() {
        return this.getVo().asBigDecimal("NROADICAO");
   }

   public void setNroAdicao(BigDecimal nroAdicao) {
        markAsChanged("NROADICAO", nroAdicao);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getSeqAd() {
        return this.getVo().asBigDecimal("SEQAD");
   }

   public void setSeqAd(BigDecimal seqAd) {
        markAsChanged("SEQAD", seqAd);
   }

   public BigDecimal getSeqDi() {
        return this.getVo().asBigDecimal("SEQDI");
   }

   public void setSeqDi(BigDecimal seqDi) {
        markAsChanged("SEQDI", seqDi);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getVlrDesc() {
        return this.getVo().asBigDecimal("VLRDESC");
   }

   public void setVlrDesc(BigDecimal vlrDesc) {
        markAsChanged("VLRDESC", vlrDesc);
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
        this.setVo(vo);
        return this;
   }
}
