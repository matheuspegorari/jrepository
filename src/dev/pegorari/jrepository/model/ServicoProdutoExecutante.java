package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ServicoProdutoExecutante extends AbstractSankhyaEntity<ServicoProdutoExecutante> {
   private BigDecimal codProd;
   private BigDecimal codServ;
   private BigDecimal codUsu;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodServ() {
        return codServ;
   }

   public void setCodServ(BigDecimal codServ) {
        markAsChanged("CODSERV", codServ);
        this.codServ = codServ;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
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
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codServ = vo.asBigDecimal("CODSERV");
        this.codUsu = vo.asBigDecimal("CODUSU");
        return this;
   }
}
