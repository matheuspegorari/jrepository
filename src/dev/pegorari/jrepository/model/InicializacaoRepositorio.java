package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class InicializacaoRepositorio extends AbstractSankhyaEntity<InicializacaoRepositorio> {
   private BigDecimal codCpm;
   private BigDecimal codProdpA;
   private String controlePa;
   private BigDecimal ideFx;
   private String tipo;

   public BigDecimal getCodCpm() {
        return codCpm;
   }

   public void setCodCpm(BigDecimal codCpm) {
        markAsChanged("CODCPM", codCpm);
        this.codCpm = codCpm;
   }

   public BigDecimal getCodProdpA() {
        return codProdpA;
   }

   public void setCodProdpA(BigDecimal codProdpA) {
        markAsChanged("CODPRODPA", codProdpA);
        this.codProdpA = codProdpA;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TPRIRPA";
   }

   @Override
   public String getEntityName() {
        return "InicializacaoRepositorio";
   }

   @Override
   public InicializacaoRepositorio fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codCpm = vo.asBigDecimal("CODCPM");
        this.codProdpA = vo.asBigDecimal("CODPRODPA");
        this.controlePa = vo.asString("CONTROLEPA");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
