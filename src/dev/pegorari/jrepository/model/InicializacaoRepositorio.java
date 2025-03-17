package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class InicializacaoRepositorio implements SankhyaEntity<InicializacaoRepositorio> {

   private BigDecimal codCpm;
   private BigDecimal codProdPa;
   private String controlePa;
   private BigDecimal ideFx;
   private String tipo;

   public BigDecimal getCodCpm() {
        return codCpm;
   }

   public void setCodCpm(BigDecimal codCpm) {
        this.codCpm = codCpm;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        this.codProdPa = codProdPa;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        this.controlePa = controlePa;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        this.ideFx = ideFx;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "InicializacaoRepositorio";
   }

   @Override
   public InicializacaoRepositorio fromVO(DynamicVO vo) {
        this.codCpm = vo.asBigDecimal("CODCPM");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
