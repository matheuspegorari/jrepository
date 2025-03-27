package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;

public class CertificadoDigital extends AbstractSankhyaEntity<CertificadoDigital> {
   public String getNomeArquivo() {
        return this.getVo().asString("NOMEARQUIVO");
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
   }

   public String getInterno() {
        return this.getVo().asString("INTERNO");
   }

   public void setInterno(String interno) {
        markAsChanged("INTERNO", interno);
   }

   public String getCgcCpf() {
        return this.getVo().asString("CGC_CPF");
   }

   public void setCgcCpf(String cgcCpf) {
        markAsChanged("CGC_CPF", cgcCpf);
   }

   @Override
   public String getTableName() {
        return "TSICDI";
   }

   @Override
   public String getEntityName() {
        return "CertificadoDigital";
   }

   @Override
   public CertificadoDigital fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
