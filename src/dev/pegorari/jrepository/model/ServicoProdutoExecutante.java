package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ServicoProdutoExecutante implements SankhyaEntity<ServicoProdutoExecutante> {

   private BigDecimal codProd;
   private BigDecimal codServ;
   private BigDecimal codUsu;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodServ() {
        return codServ;
   }

   public void setCodServ(BigDecimal codServ) {
        this.codServ = codServ;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   @Override
   public String getEntityName() {
        return "ServicoProdutoExecutante";
   }

   @Override
   public ServicoProdutoExecutante fromVO(DynamicVO vo) {
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codServ = vo.asBigDecimal("CODSERV");
        this.codUsu = vo.asBigDecimal("CODUSU");
        return this;
   }
}
