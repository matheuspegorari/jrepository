package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CacheServicoBoaVista extends AbstractSankhyaEntity<CacheServicoBoaVista> {
   private String cgcCpf;
   private String cmc7;
   private BigDecimal codUsu;
   private Timestamp dhConsulta;
   private char[] resposta;
   private String tipConsulta;

   public String getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(String cgcCpf) {
        this.cgcCpf = cgcCpf;
   }

   public String getCmc7() {
        return cmc7;
   }

   public void setCmc7(String cmc7) {
        this.cmc7 = cmc7;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhConsulta() {
        return dhConsulta;
   }

   public void setDhConsulta(Timestamp dhConsulta) {
        this.dhConsulta = dhConsulta;
   }

   public char[] getResposta() {
        return resposta;
   }

   public void setResposta(char[] resposta) {
        this.resposta = resposta;
   }

   public String getTipConsulta() {
        return tipConsulta;
   }

   public void setTipConsulta(String tipConsulta) {
        this.tipConsulta = tipConsulta;
   }

   @Override
   public String getTableName() {
        return "TGFBOA";
   }

   @Override
   public String getEntityName() {
        return "CacheServicoBoaVista";
   }

   @Override
   public CacheServicoBoaVista fromVO(DynamicVO vo) {
        this.cgcCpf = vo.asString("CGC_CPF");
        this.cmc7 = vo.asString("CMC7");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhConsulta = vo.asTimestamp("DHCONSULTA");
        this.resposta = vo.asClob("RESPOSTA");
        this.tipConsulta = vo.asString("TIPCONSULTA");
        return this;
   }
}
