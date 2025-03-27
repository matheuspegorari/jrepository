package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ValePedagioMDFE extends AbstractSankhyaEntity<ValePedagioMDFE> {
   public BigDecimal getCodParcPag() {
        return this.getVo().asBigDecimal("CODPARCPAG");
   }

   public void setCodParcPag(BigDecimal codParcPag) {
        markAsChanged("CODPARCPAG", codParcPag);
   }

   public BigDecimal getCodParcForn() {
        return this.getVo().asBigDecimal("CODPARCFORN");
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        markAsChanged("CODPARCFORN", codParcForn);
   }

   public String getNuCompra() {
        return this.getVo().asString("NUCOMPRA");
   }

   public void setNuCompra(String nuCompra) {
        markAsChanged("NUCOMPRA", nuCompra);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public BigDecimal getVlrPedagio() {
        return this.getVo().asBigDecimal("VLRPEDAGIO");
   }

   public void setVlrPedagio(BigDecimal vlrPedagio) {
        markAsChanged("VLRPEDAGIO", vlrPedagio);
   }

   public String getCategCombVeic() {
        return this.getVo().asString("CATEGCOMBVEIC");
   }

   public void setCategCombVeic(String categCombVeic) {
        markAsChanged("CATEGCOMBVEIC", categCombVeic);
   }

   public String getTpValePed() {
        return this.getVo().asString("TPVALEPED");
   }

   public void setTpValePed(String tpValePed) {
        markAsChanged("TPVALEPED", tpValePed);
   }

   @Override
   public String getTableName() {
        return "TGFMDFEVALP";
   }

   @Override
   public String getEntityName() {
        return "ValePedagioMDFE";
   }

   @Override
   public ValePedagioMDFE fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
