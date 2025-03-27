package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class InicializacaoRepositorio extends AbstractSankhyaEntity<InicializacaoRepositorio> {
   public BigDecimal getCodCpm() {
        return this.getVo().asBigDecimal("CODCPM");
   }

   public void setCodCpm(BigDecimal codCpm) {
        markAsChanged("CODCPM", codCpm);
   }

   public BigDecimal getCodProdpA() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdpA(BigDecimal codProdpA) {
        markAsChanged("CODPRODPA", codProdpA);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
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
        return this;
   }
}
