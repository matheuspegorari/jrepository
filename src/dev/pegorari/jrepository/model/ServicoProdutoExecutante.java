package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ServicoProdutoExecutante extends AbstractSankhyaEntity<ServicoProdutoExecutante> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodServ() {
        return this.getVo().asBigDecimal("CODSERV");
   }

   public void setCodServ(BigDecimal codServ) {
        markAsChanged("CODSERV", codServ);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   @Override
   public String getTableName() {
        return "TGFSEU";
   }

   @Override
   public String getEntityName() {
        return "ServicoProdutoExecutante";
   }

   @Override
   public ServicoProdutoExecutante fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
