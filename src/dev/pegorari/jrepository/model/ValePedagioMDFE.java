package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ValePedagioMDFE implements SankhyaEntity<ValePedagioMDFE> {

   private BigDecimal codParcPag;
   private BigDecimal codParcForn;
   private String nuCompra;
   private BigDecimal sequencia;
   private BigDecimal nuViag;
   private BigDecimal seqMdfe;
   private BigDecimal vlrPedagio;
   private String categCombVeic;
   private String tpValePed;

   public BigDecimal getCodParcPag() {
        return codParcPag;
   }

   public void setCodParcPag(BigDecimal codParcPag) {
        this.codParcPag = codParcPag;
   }

   public BigDecimal getCodParcForn() {
        return codParcForn;
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        this.codParcForn = codParcForn;
   }

   public String getNuCompra() {
        return nuCompra;
   }

   public void setNuCompra(String nuCompra) {
        this.nuCompra = nuCompra;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        this.nuViag = nuViag;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getVlrPedagio() {
        return vlrPedagio;
   }

   public void setVlrPedagio(BigDecimal vlrPedagio) {
        this.vlrPedagio = vlrPedagio;
   }

   public String getCategCombVeic() {
        return categCombVeic;
   }

   public void setCategCombVeic(String categCombVeic) {
        this.categCombVeic = categCombVeic;
   }

   public String getTpValePed() {
        return tpValePed;
   }

   public void setTpValePed(String tpValePed) {
        this.tpValePed = tpValePed;
   }

   @Override
   public String getEntityName() {
        return "ValePedagioMDFE";
   }

   @Override
   public ValePedagioMDFE fromVO(DynamicVO vo) {
        this.codParcPag = vo.asBigDecimal("CODPARCPAG");
        this.codParcForn = vo.asBigDecimal("CODPARCFORN");
        this.nuCompra = vo.asString("NUCOMPRA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.vlrPedagio = vo.asBigDecimal("VLRPEDAGIO");
        this.categCombVeic = vo.asString("CATEGCOMBVEIC");
        this.tpValePed = vo.asString("TPVALEPED");
        return this;
   }
}
