package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Funcionario implements SankhyaEntity<Funcionario> {

   private BigDecimal dependConvMed;
   private BigDecimal dependIrf;
   private BigDecimal dependSalFam;
   private BigDecimal diaApuraPonto;
   private BigDecimal diaCadPis;
   private BigDecimal diasFerias;
   private String ajudaComp;
   private String aprendContrInd;
   private String bloqueiaBatidaOnline;
   private BigDecimal codMadDem;
   private Timestamp dtFimContrInt;
   private Timestamp dtFimRed;
   private Timestamp dtInicioRed;
   private BigDecimal horasSemCpu;
   private BigDecimal horasSemRed;
   private BigDecimal diasPeriodo1;
   private BigDecimal diasPeriodo2;
   private String dirReciproco;
   private Timestamp dtAdm;
   private Timestamp dtAfastamento;
   private Timestamp dtAlter;
   private BigDecimal codSind;
   private BigDecimal codTomador;
   private BigDecimal codUsu;
   private String complemento;
   private String convMed;
   private String cpf;
   private String ctaFgts;
   private String deficienteFisico;
   private String afastFgts;
   private BigDecimal afastRais;
   private BigDecimal anoChegPais;
   private String categoriaCnh;
   private BigDecimal causaAfast;
   private String celular;
   private String cep;
   private BigDecimal cidNasc;
   private String codAdmFgts;
   private String codAdmFgtsIi;
   private String codAge;
   private BigDecimal codBai;
   private BigDecimal codBco;
   private BigDecimal codCargaHor;
   private BigDecimal codCargo;
   private BigDecimal codCateg;
   private BigDecimal codCid;
   private BigDecimal codCidTrab;
   private String codCtAbco;
   private BigDecimal codDep;
   private BigDecimal codEmp;
   private BigDecimal codEmpOrig;
   private BigDecimal codEnd;
   private BigDecimal codFunc;
   private BigDecimal codFuncao;
   private BigDecimal codFuncOrig;
   private Timestamp dtAvisoPrevio;
   private Timestamp dtCadPis;
   private Timestamp dtCarteiraSaude;
   private Timestamp dtCps;
   private Timestamp dtDem;
   private Timestamp dtNasc;
   private Timestamp dtOptFgts;
   private Timestamp dtRg;
   private Timestamp dtTransferencia;
   private Timestamp dtValPais;
   private Timestamp dtVencExp1;
   private Timestamp dtVencExp2;
   private String email;
   private BigDecimal estadoCivil;
   private BigDecimal horasSem;
   private String identidade;
   private byte[] imagem;
   private BigDecimal matricula;
   private BigDecimal mesDia;
   private BigDecimal nacionalidade;
   private BigDecimal nacionalPais;
   private BigDecimal nivEsc;
   private String nomeFunc;
   private String nomeMae;
   private String nomePai;
   private String nroCnh;
   private String nroReservista;
   private BigDecimal numCartaoPonto;
   private BigDecimal numCps;
   private String numEnd;
   private String orgaoRg;
   private String partPat;
   private BigDecimal percAdiantamento;
   private BigDecimal percConv;
   private String pis;
   private Timestamp primeiraCnh;
   private String primeEmprego;
   private BigDecimal racaFuncionario;
   private BigDecimal regime;
   private BigDecimal remuMinima;
   private String rne;
   private BigDecimal salBase;
   private BigDecimal secaoEleitoral;
   private String senha;
   private String serieCps;
   private String sexo;
   private String sindicalizado;
   private String sitPais;
   private String sitSind;
   private String situacao;
   private String telefone;
   private String tipConta;
   private BigDecimal tipDeficiencia;
   private String tipPonto;
   private String tipReceb;
   private String tipSal;
   private String tipTab;
   private String titEleitoral;
   private String trabOutraEmp;
   private BigDecimal ufCps;
   private Timestamp vencimentoCnh;
   private BigDecimal vinculo;
   private BigDecimal zonaEleitoral;
   private BigDecimal codGrupoCtbz;
   private BigDecimal codParc;
   private BigDecimal codSaq;
   private String casadoBr;
   private BigDecimal clasTrabEstrang;
   private Timestamp dtChegPais;
   private Timestamp dtExpRne;
   private Timestamp dtNatural;
   private String filhosBr;
   private BigDecimal indAdmissao;
   private String nroNatural;
   private String obsDeficiencia;
   private BigDecimal optFgts;
   private String orgaoCnh;
   private String orgaoRne;
   private BigDecimal regimeJor;
   private BigDecimal regimeTrab;
   private BigDecimal codCarreira;
   private BigDecimal codCategTrabCedido;
   private BigDecimal codCidCertCivil;
   private BigDecimal codConvenio;
   private BigDecimal codEmpDest;
   private BigDecimal codEmpFuncSubst;
   private BigDecimal codEmpFuncSup;
   private BigDecimal codEmpRespNis;
   private BigDecimal codFuncDest;
   private BigDecimal codFuncSubst;
   private BigDecimal codFuncSup;
   private BigDecimal codGrupoHorario;
   private String codMotDesligTransf;
   private BigDecimal codNivel;
   private BigDecimal codTpr;
   private String compensaSabado;
   private BigDecimal compSalario;
   private String contratoSusp;
   private BigDecimal contTrabTemp;
   private String cpfAnt;
   private String cpfSubstituido;
   private String crmMedicoAso;
   private BigDecimal diasAvisoPrevio;
   private BigDecimal diasEmGrupoHr;
   private String dispensaPonto;
   private String dispPerExp;
   private String dscAtivDes;
   private Timestamp dtAdmEmpCed;
   private Timestamp dtAltCpf;
   private Timestamp dtAso;
   private Timestamp dtEmiCertCivil;
   private Timestamp dtEmiPporte;
   private Timestamp dtEsocial2205;
   private Timestamp dtEsocial2206;
   private Timestamp dtExpOc;
   private Timestamp dtFimQuarentena;
   private Timestamp dtIncEsocial;
   private Timestamp dtIniGrupoHr;
   private Timestamp dtLaudoRra;
   private Timestamp dtLoteNis;
   private Timestamp dtQuitacao;
   private Timestamp dtTermino;
   private Timestamp dtTransfDest;
   private Timestamp dtUltEnvEsocial;
   private Timestamp dtValOc;
   private Timestamp dtValPporte;
   private Timestamp dtVencExp1Or;
   private Timestamp dtVencExp2Or;
   private Timestamp dtVincEmpAnt;
   private String emissorPporte;
   private String envEsocial;
   private Timestamp fimValeSocial;
   private String idConsig;
   private BigDecimal indCumprParc;
   private BigDecimal indMv;
   private String indNif;
   private String infoCota;
   private BigDecimal infoOnus;
   private Timestamp iniValeSocial;
   private String insConsig;
   private String jornadaEspProf;
   private BigDecimal jornadaProf;
   private String justContr;
   private String justProrr;
   private BigDecimal matricAnt;
   private String matriculaEmpAnt;
   private String matriculaEmpCed;
   private String matriculaOld;
   private String medicoAso;
   private String mei;
   private String meTerg;
   private BigDecimal mtvDesligTsv;
   private String nifBenef;
   private String nisEnviado;
   private String nmSocial;
   private String nomeArqHomologNet;
   private String novoEmprego;
   private String nrCertObito;
   private String nrContr;
   private String nrInscEstabVinc;
   private String nrInscTomador;
   private String nroC;
   private String nroCertCivil;
   private String nroFolhaReg;
   private String nroLivroReg;
   private String nroPassaporte;
   private String nroProcessoRra;
   private BigDecimal numLoteNis;
   private BigDecimal nuProcessoJud;
   private BigDecimal nuProcessoTrab;
   private BigDecimal nuRequisicao;
   private String objDet;
   private String obsAltCpf;
   private String obsEmpAnt;
   private String observacao;
   private String obsVariavel;
   private String cnpjEmpCed;
   private BigDecimal ordemGrupoHr;
   private String orgaoOc;
   private BigDecimal percInsal;
   private BigDecimal percPeric;
   private String pertenceDp;
   private String possuiRra;
   private String provisao13;
   private String provisaoFerias;
   private BigDecimal quemPagaRra;
   private String reciboEsocial;
   private BigDecimal remunBase;
   private BigDecimal remuneracaoMesAnt;
   private BigDecimal salAjustadoSind;
   private BigDecimal salBaseAnterior;
   private BigDecimal salProfessor;
   private String segDesemprego;
   private BigDecimal semanasPorMes;
   private String semIntegral;
   private String sitEsocial;
   private String step;
   private String suspExpAfast;
   private String telMedicoAso;
   private String temContribSindical;
   private String temDescAssist;
   private String tempoParcial;
   private String tipCertidao;
   private BigDecimal tpInclContr;
   private BigDecimal tpInscEstabVinc;
   private BigDecimal tpInscTomador;
   private BigDecimal tpRegPrevCed;
   private BigDecimal tpRegTrabCed;
   private String trabAposent;
   private String ufCrmMedAso;
   private BigDecimal ufPporte;
   private BigDecimal codCategEsocial;
   private BigDecimal codCidRic;
   private String complementOrg;
   private Timestamp dtEmiRic;
   private Timestamp dtExpCnh;
   private String nroRic;
   private String orgaoRic;
   private BigDecimal ufCnh;
   private BigDecimal ufRg;
   private BigDecimal usuVpjSup;
   private String aprendizGravida;
   private String cadIni;
   private String cagedAdm;
   private String caixaPostal;
   private String cartorio;
   private String cnpjDestTransf;
   private String cnpjEmpAnt;
   private BigDecimal codPaisNac;
   private Timestamp dtFimRemun;
   private String endFiscExt;
   private BigDecimal formTribu;
   private BigDecimal indSitRemunDeslig;
   private BigDecimal motExpatriado;
   private String condIngEstrang;
   private String tmpResidTrabEstrang;
   private String numProcTsvE;
   private String transfExterna;
   private String ctpsDigital;
   private String situacaoAnt;
   private String acessoPortalRh;
   private String afastFgtsAnt;
   private BigDecimal afastRaisAnt;
   private BigDecimal causaAfastAnt;
   private String cnpjEntQual;
   private String cnpjPrat;
   private BigDecimal codCategEsocialAnt;
   private BigDecimal codTprJud;
   private BigDecimal codUsuSnk;
   private Timestamp dtAdmJud;
   private Timestamp dtAltS2200;
   private Timestamp dtAltS2299;
   private Timestamp dtDemJud;
   private Timestamp dtSentProcTrab;
   private String identidadeGenero;
   private BigDecimal indAdmissaoAnt;
   private String matAnotJud;
   private String motDesligEsocial;
   private String motDesligEsocialAnt;
   private String natAtividade;
   private String natAtividadeAnt;
   private String nrInscAprend;
   private String nrProcTrabAnt;
   private String nrProcTrabDeslig;
   private String orientacaoSexual;
   private String possuiFilhos;
   private String pvd;
   private String reciboEsocial2200;
   private String reciboEsocial2205;
   private String reciboEsocial2206;
   private String temUsuSnk;
   private BigDecimal tpInscAprend;
   private String nrProcTrab;
   private String observacaoMp;
   private BigDecimal perRedCpu;
   private String replider;
   private BigDecimal salBaseCpu;
   private BigDecimal salBaseRed;
   private String suspContrato;
   private Timestamp dtDispensaPonto;
   private BigDecimal codLocalPonto;
   private String validado;
   private String transfSemOnusCedente;

   public BigDecimal getDependConvMed() {
        return dependConvMed;
   }

   public void setDependConvMed(BigDecimal dependConvMed) {
        this.dependConvMed = dependConvMed;
   }

   public BigDecimal getDependIrf() {
        return dependIrf;
   }

   public void setDependIrf(BigDecimal dependIrf) {
        this.dependIrf = dependIrf;
   }

   public BigDecimal getDependSalFam() {
        return dependSalFam;
   }

   public void setDependSalFam(BigDecimal dependSalFam) {
        this.dependSalFam = dependSalFam;
   }

   public BigDecimal getDiaApuraPonto() {
        return diaApuraPonto;
   }

   public void setDiaApuraPonto(BigDecimal diaApuraPonto) {
        this.diaApuraPonto = diaApuraPonto;
   }

   public BigDecimal getDiaCadPis() {
        return diaCadPis;
   }

   public void setDiaCadPis(BigDecimal diaCadPis) {
        this.diaCadPis = diaCadPis;
   }

   public BigDecimal getDiasFerias() {
        return diasFerias;
   }

   public void setDiasFerias(BigDecimal diasFerias) {
        this.diasFerias = diasFerias;
   }

   public String getAjudaComp() {
        return ajudaComp;
   }

   public void setAjudaComp(String ajudaComp) {
        this.ajudaComp = ajudaComp;
   }

   public String getAprendContrInd() {
        return aprendContrInd;
   }

   public void setAprendContrInd(String aprendContrInd) {
        this.aprendContrInd = aprendContrInd;
   }

   public String getBloqueiaBatidaOnline() {
        return bloqueiaBatidaOnline;
   }

   public void setBloqueiaBatidaOnline(String bloqueiaBatidaOnline) {
        this.bloqueiaBatidaOnline = bloqueiaBatidaOnline;
   }

   public BigDecimal getCodMadDem() {
        return codMadDem;
   }

   public void setCodMadDem(BigDecimal codMadDem) {
        this.codMadDem = codMadDem;
   }

   public Timestamp getDtFimContrInt() {
        return dtFimContrInt;
   }

   public void setDtFimContrInt(Timestamp dtFimContrInt) {
        this.dtFimContrInt = dtFimContrInt;
   }

   public Timestamp getDtFimRed() {
        return dtFimRed;
   }

   public void setDtFimRed(Timestamp dtFimRed) {
        this.dtFimRed = dtFimRed;
   }

   public Timestamp getDtInicioRed() {
        return dtInicioRed;
   }

   public void setDtInicioRed(Timestamp dtInicioRed) {
        this.dtInicioRed = dtInicioRed;
   }

   public BigDecimal getHorasSemCpu() {
        return horasSemCpu;
   }

   public void setHorasSemCpu(BigDecimal horasSemCpu) {
        this.horasSemCpu = horasSemCpu;
   }

   public BigDecimal getHorasSemRed() {
        return horasSemRed;
   }

   public void setHorasSemRed(BigDecimal horasSemRed) {
        this.horasSemRed = horasSemRed;
   }

   public BigDecimal getDiasPeriodo1() {
        return diasPeriodo1;
   }

   public void setDiasPeriodo1(BigDecimal diasPeriodo1) {
        this.diasPeriodo1 = diasPeriodo1;
   }

   public BigDecimal getDiasPeriodo2() {
        return diasPeriodo2;
   }

   public void setDiasPeriodo2(BigDecimal diasPeriodo2) {
        this.diasPeriodo2 = diasPeriodo2;
   }

   public String getDirReciproco() {
        return dirReciproco;
   }

   public void setDirReciproco(String dirReciproco) {
        this.dirReciproco = dirReciproco;
   }

   public Timestamp getDtAdm() {
        return dtAdm;
   }

   public void setDtAdm(Timestamp dtAdm) {
        this.dtAdm = dtAdm;
   }

   public Timestamp getDtAfastamento() {
        return dtAfastamento;
   }

   public void setDtAfastamento(Timestamp dtAfastamento) {
        this.dtAfastamento = dtAfastamento;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getCodSind() {
        return codSind;
   }

   public void setCodSind(BigDecimal codSind) {
        this.codSind = codSind;
   }

   public BigDecimal getCodTomador() {
        return codTomador;
   }

   public void setCodTomador(BigDecimal codTomador) {
        this.codTomador = codTomador;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getComplemento() {
        return complemento;
   }

   public void setComplemento(String complemento) {
        this.complemento = complemento;
   }

   public String getConvMed() {
        return convMed;
   }

   public void setConvMed(String convMed) {
        this.convMed = convMed;
   }

   public String getCpf() {
        return cpf;
   }

   public void setCpf(String cpf) {
        this.cpf = cpf;
   }

   public String getCtaFgts() {
        return ctaFgts;
   }

   public void setCtaFgts(String ctaFgts) {
        this.ctaFgts = ctaFgts;
   }

   public String getDeficienteFisico() {
        return deficienteFisico;
   }

   public void setDeficienteFisico(String deficienteFisico) {
        this.deficienteFisico = deficienteFisico;
   }

   public String getAfastFgts() {
        return afastFgts;
   }

   public void setAfastFgts(String afastFgts) {
        this.afastFgts = afastFgts;
   }

   public BigDecimal getAfastRais() {
        return afastRais;
   }

   public void setAfastRais(BigDecimal afastRais) {
        this.afastRais = afastRais;
   }

   public BigDecimal getAnoChegPais() {
        return anoChegPais;
   }

   public void setAnoChegPais(BigDecimal anoChegPais) {
        this.anoChegPais = anoChegPais;
   }

   public String getCategoriaCnh() {
        return categoriaCnh;
   }

   public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
   }

   public BigDecimal getCausaAfast() {
        return causaAfast;
   }

   public void setCausaAfast(BigDecimal causaAfast) {
        this.causaAfast = causaAfast;
   }

   public String getCelular() {
        return celular;
   }

   public void setCelular(String celular) {
        this.celular = celular;
   }

   public String getCep() {
        return cep;
   }

   public void setCep(String cep) {
        this.cep = cep;
   }

   public BigDecimal getCidNasc() {
        return cidNasc;
   }

   public void setCidNasc(BigDecimal cidNasc) {
        this.cidNasc = cidNasc;
   }

   public String getCodAdmFgts() {
        return codAdmFgts;
   }

   public void setCodAdmFgts(String codAdmFgts) {
        this.codAdmFgts = codAdmFgts;
   }

   public String getCodAdmFgtsIi() {
        return codAdmFgtsIi;
   }

   public void setCodAdmFgtsIi(String codAdmFgtsIi) {
        this.codAdmFgtsIi = codAdmFgtsIi;
   }

   public String getCodAge() {
        return codAge;
   }

   public void setCodAge(String codAge) {
        this.codAge = codAge;
   }

   public BigDecimal getCodBai() {
        return codBai;
   }

   public void setCodBai(BigDecimal codBai) {
        this.codBai = codBai;
   }

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        this.codBco = codBco;
   }

   public BigDecimal getCodCargaHor() {
        return codCargaHor;
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        this.codCargaHor = codCargaHor;
   }

   public BigDecimal getCodCargo() {
        return codCargo;
   }

   public void setCodCargo(BigDecimal codCargo) {
        this.codCargo = codCargo;
   }

   public BigDecimal getCodCateg() {
        return codCateg;
   }

   public void setCodCateg(BigDecimal codCateg) {
        this.codCateg = codCateg;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        this.codCid = codCid;
   }

   public BigDecimal getCodCidTrab() {
        return codCidTrab;
   }

   public void setCodCidTrab(BigDecimal codCidTrab) {
        this.codCidTrab = codCidTrab;
   }

   public String getCodCtAbco() {
        return codCtAbco;
   }

   public void setCodCtAbco(String codCtAbco) {
        this.codCtAbco = codCtAbco;
   }

   public BigDecimal getCodDep() {
        return codDep;
   }

   public void setCodDep(BigDecimal codDep) {
        this.codDep = codDep;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEmpOrig() {
        return codEmpOrig;
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        this.codEmpOrig = codEmpOrig;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        this.codEnd = codEnd;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public BigDecimal getCodFuncao() {
        return codFuncao;
   }

   public void setCodFuncao(BigDecimal codFuncao) {
        this.codFuncao = codFuncao;
   }

   public BigDecimal getCodFuncOrig() {
        return codFuncOrig;
   }

   public void setCodFuncOrig(BigDecimal codFuncOrig) {
        this.codFuncOrig = codFuncOrig;
   }

   public Timestamp getDtAvisoPrevio() {
        return dtAvisoPrevio;
   }

   public void setDtAvisoPrevio(Timestamp dtAvisoPrevio) {
        this.dtAvisoPrevio = dtAvisoPrevio;
   }

   public Timestamp getDtCadPis() {
        return dtCadPis;
   }

   public void setDtCadPis(Timestamp dtCadPis) {
        this.dtCadPis = dtCadPis;
   }

   public Timestamp getDtCarteiraSaude() {
        return dtCarteiraSaude;
   }

   public void setDtCarteiraSaude(Timestamp dtCarteiraSaude) {
        this.dtCarteiraSaude = dtCarteiraSaude;
   }

   public Timestamp getDtCps() {
        return dtCps;
   }

   public void setDtCps(Timestamp dtCps) {
        this.dtCps = dtCps;
   }

   public Timestamp getDtDem() {
        return dtDem;
   }

   public void setDtDem(Timestamp dtDem) {
        this.dtDem = dtDem;
   }

   public Timestamp getDtNasc() {
        return dtNasc;
   }

   public void setDtNasc(Timestamp dtNasc) {
        this.dtNasc = dtNasc;
   }

   public Timestamp getDtOptFgts() {
        return dtOptFgts;
   }

   public void setDtOptFgts(Timestamp dtOptFgts) {
        this.dtOptFgts = dtOptFgts;
   }

   public Timestamp getDtRg() {
        return dtRg;
   }

   public void setDtRg(Timestamp dtRg) {
        this.dtRg = dtRg;
   }

   public Timestamp getDtTransferencia() {
        return dtTransferencia;
   }

   public void setDtTransferencia(Timestamp dtTransferencia) {
        this.dtTransferencia = dtTransferencia;
   }

   public Timestamp getDtValPais() {
        return dtValPais;
   }

   public void setDtValPais(Timestamp dtValPais) {
        this.dtValPais = dtValPais;
   }

   public Timestamp getDtVencExp1() {
        return dtVencExp1;
   }

   public void setDtVencExp1(Timestamp dtVencExp1) {
        this.dtVencExp1 = dtVencExp1;
   }

   public Timestamp getDtVencExp2() {
        return dtVencExp2;
   }

   public void setDtVencExp2(Timestamp dtVencExp2) {
        this.dtVencExp2 = dtVencExp2;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        this.email = email;
   }

   public BigDecimal getEstadoCivil() {
        return estadoCivil;
   }

   public void setEstadoCivil(BigDecimal estadoCivil) {
        this.estadoCivil = estadoCivil;
   }

   public BigDecimal getHorasSem() {
        return horasSem;
   }

   public void setHorasSem(BigDecimal horasSem) {
        this.horasSem = horasSem;
   }

   public String getIdentidade() {
        return identidade;
   }

   public void setIdentidade(String identidade) {
        this.identidade = identidade;
   }

   public byte[] getImagem() {
        return imagem;
   }

   public void setImagem(byte[] imagem) {
        this.imagem = imagem;
   }

   public BigDecimal getMatricula() {
        return matricula;
   }

   public void setMatricula(BigDecimal matricula) {
        this.matricula = matricula;
   }

   public BigDecimal getMesDia() {
        return mesDia;
   }

   public void setMesDia(BigDecimal mesDia) {
        this.mesDia = mesDia;
   }

   public BigDecimal getNacionalidade() {
        return nacionalidade;
   }

   public void setNacionalidade(BigDecimal nacionalidade) {
        this.nacionalidade = nacionalidade;
   }

   public BigDecimal getNacionalPais() {
        return nacionalPais;
   }

   public void setNacionalPais(BigDecimal nacionalPais) {
        this.nacionalPais = nacionalPais;
   }

   public BigDecimal getNivEsc() {
        return nivEsc;
   }

   public void setNivEsc(BigDecimal nivEsc) {
        this.nivEsc = nivEsc;
   }

   public String getNomeFunc() {
        return nomeFunc;
   }

   public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
   }

   public String getNomeMae() {
        return nomeMae;
   }

   public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
   }

   public String getNomePai() {
        return nomePai;
   }

   public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
   }

   public String getNroCnh() {
        return nroCnh;
   }

   public void setNroCnh(String nroCnh) {
        this.nroCnh = nroCnh;
   }

   public String getNroReservista() {
        return nroReservista;
   }

   public void setNroReservista(String nroReservista) {
        this.nroReservista = nroReservista;
   }

   public BigDecimal getNumCartaoPonto() {
        return numCartaoPonto;
   }

   public void setNumCartaoPonto(BigDecimal numCartaoPonto) {
        this.numCartaoPonto = numCartaoPonto;
   }

   public BigDecimal getNumCps() {
        return numCps;
   }

   public void setNumCps(BigDecimal numCps) {
        this.numCps = numCps;
   }

   public String getNumEnd() {
        return numEnd;
   }

   public void setNumEnd(String numEnd) {
        this.numEnd = numEnd;
   }

   public String getOrgaoRg() {
        return orgaoRg;
   }

   public void setOrgaoRg(String orgaoRg) {
        this.orgaoRg = orgaoRg;
   }

   public String getPartPat() {
        return partPat;
   }

   public void setPartPat(String partPat) {
        this.partPat = partPat;
   }

   public BigDecimal getPercAdiantamento() {
        return percAdiantamento;
   }

   public void setPercAdiantamento(BigDecimal percAdiantamento) {
        this.percAdiantamento = percAdiantamento;
   }

   public BigDecimal getPercConv() {
        return percConv;
   }

   public void setPercConv(BigDecimal percConv) {
        this.percConv = percConv;
   }

   public String getPis() {
        return pis;
   }

   public void setPis(String pis) {
        this.pis = pis;
   }

   public Timestamp getPrimeiraCnh() {
        return primeiraCnh;
   }

   public void setPrimeiraCnh(Timestamp primeiraCnh) {
        this.primeiraCnh = primeiraCnh;
   }

   public String getPrimeEmprego() {
        return primeEmprego;
   }

   public void setPrimeEmprego(String primeEmprego) {
        this.primeEmprego = primeEmprego;
   }

   public BigDecimal getRacaFuncionario() {
        return racaFuncionario;
   }

   public void setRacaFuncionario(BigDecimal racaFuncionario) {
        this.racaFuncionario = racaFuncionario;
   }

   public BigDecimal getRegime() {
        return regime;
   }

   public void setRegime(BigDecimal regime) {
        this.regime = regime;
   }

   public BigDecimal getRemuMinima() {
        return remuMinima;
   }

   public void setRemuMinima(BigDecimal remuMinima) {
        this.remuMinima = remuMinima;
   }

   public String getRne() {
        return rne;
   }

   public void setRne(String rne) {
        this.rne = rne;
   }

   public BigDecimal getSalBase() {
        return salBase;
   }

   public void setSalBase(BigDecimal salBase) {
        this.salBase = salBase;
   }

   public BigDecimal getSecaoEleitoral() {
        return secaoEleitoral;
   }

   public void setSecaoEleitoral(BigDecimal secaoEleitoral) {
        this.secaoEleitoral = secaoEleitoral;
   }

   public String getSenha() {
        return senha;
   }

   public void setSenha(String senha) {
        this.senha = senha;
   }

   public String getSerieCps() {
        return serieCps;
   }

   public void setSerieCps(String serieCps) {
        this.serieCps = serieCps;
   }

   public String getSexo() {
        return sexo;
   }

   public void setSexo(String sexo) {
        this.sexo = sexo;
   }

   public String getSindicalizado() {
        return sindicalizado;
   }

   public void setSindicalizado(String sindicalizado) {
        this.sindicalizado = sindicalizado;
   }

   public String getSitPais() {
        return sitPais;
   }

   public void setSitPais(String sitPais) {
        this.sitPais = sitPais;
   }

   public String getSitSind() {
        return sitSind;
   }

   public void setSitSind(String sitSind) {
        this.sitSind = sitSind;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        this.telefone = telefone;
   }

   public String getTipConta() {
        return tipConta;
   }

   public void setTipConta(String tipConta) {
        this.tipConta = tipConta;
   }

   public BigDecimal getTipDeficiencia() {
        return tipDeficiencia;
   }

   public void setTipDeficiencia(BigDecimal tipDeficiencia) {
        this.tipDeficiencia = tipDeficiencia;
   }

   public String getTipPonto() {
        return tipPonto;
   }

   public void setTipPonto(String tipPonto) {
        this.tipPonto = tipPonto;
   }

   public String getTipReceb() {
        return tipReceb;
   }

   public void setTipReceb(String tipReceb) {
        this.tipReceb = tipReceb;
   }

   public String getTipSal() {
        return tipSal;
   }

   public void setTipSal(String tipSal) {
        this.tipSal = tipSal;
   }

   public String getTipTab() {
        return tipTab;
   }

   public void setTipTab(String tipTab) {
        this.tipTab = tipTab;
   }

   public String getTitEleitoral() {
        return titEleitoral;
   }

   public void setTitEleitoral(String titEleitoral) {
        this.titEleitoral = titEleitoral;
   }

   public String getTrabOutraEmp() {
        return trabOutraEmp;
   }

   public void setTrabOutraEmp(String trabOutraEmp) {
        this.trabOutraEmp = trabOutraEmp;
   }

   public BigDecimal getUfCps() {
        return ufCps;
   }

   public void setUfCps(BigDecimal ufCps) {
        this.ufCps = ufCps;
   }

   public Timestamp getVencimentoCnh() {
        return vencimentoCnh;
   }

   public void setVencimentoCnh(Timestamp vencimentoCnh) {
        this.vencimentoCnh = vencimentoCnh;
   }

   public BigDecimal getVinculo() {
        return vinculo;
   }

   public void setVinculo(BigDecimal vinculo) {
        this.vinculo = vinculo;
   }

   public BigDecimal getZonaEleitoral() {
        return zonaEleitoral;
   }

   public void setZonaEleitoral(BigDecimal zonaEleitoral) {
        this.zonaEleitoral = zonaEleitoral;
   }

   public BigDecimal getCodGrupoCtbz() {
        return codGrupoCtbz;
   }

   public void setCodGrupoCtbz(BigDecimal codGrupoCtbz) {
        this.codGrupoCtbz = codGrupoCtbz;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodSaq() {
        return codSaq;
   }

   public void setCodSaq(BigDecimal codSaq) {
        this.codSaq = codSaq;
   }

   public String getCasadoBr() {
        return casadoBr;
   }

   public void setCasadoBr(String casadoBr) {
        this.casadoBr = casadoBr;
   }

   public BigDecimal getClasTrabEstrang() {
        return clasTrabEstrang;
   }

   public void setClasTrabEstrang(BigDecimal clasTrabEstrang) {
        this.clasTrabEstrang = clasTrabEstrang;
   }

   public Timestamp getDtChegPais() {
        return dtChegPais;
   }

   public void setDtChegPais(Timestamp dtChegPais) {
        this.dtChegPais = dtChegPais;
   }

   public Timestamp getDtExpRne() {
        return dtExpRne;
   }

   public void setDtExpRne(Timestamp dtExpRne) {
        this.dtExpRne = dtExpRne;
   }

   public Timestamp getDtNatural() {
        return dtNatural;
   }

   public void setDtNatural(Timestamp dtNatural) {
        this.dtNatural = dtNatural;
   }

   public String getFilhosBr() {
        return filhosBr;
   }

   public void setFilhosBr(String filhosBr) {
        this.filhosBr = filhosBr;
   }

   public BigDecimal getIndAdmissao() {
        return indAdmissao;
   }

   public void setIndAdmissao(BigDecimal indAdmissao) {
        this.indAdmissao = indAdmissao;
   }

   public String getNroNatural() {
        return nroNatural;
   }

   public void setNroNatural(String nroNatural) {
        this.nroNatural = nroNatural;
   }

   public String getObsDeficiencia() {
        return obsDeficiencia;
   }

   public void setObsDeficiencia(String obsDeficiencia) {
        this.obsDeficiencia = obsDeficiencia;
   }

   public BigDecimal getOptFgts() {
        return optFgts;
   }

   public void setOptFgts(BigDecimal optFgts) {
        this.optFgts = optFgts;
   }

   public String getOrgaoCnh() {
        return orgaoCnh;
   }

   public void setOrgaoCnh(String orgaoCnh) {
        this.orgaoCnh = orgaoCnh;
   }

   public String getOrgaoRne() {
        return orgaoRne;
   }

   public void setOrgaoRne(String orgaoRne) {
        this.orgaoRne = orgaoRne;
   }

   public BigDecimal getRegimeJor() {
        return regimeJor;
   }

   public void setRegimeJor(BigDecimal regimeJor) {
        this.regimeJor = regimeJor;
   }

   public BigDecimal getRegimeTrab() {
        return regimeTrab;
   }

   public void setRegimeTrab(BigDecimal regimeTrab) {
        this.regimeTrab = regimeTrab;
   }

   public BigDecimal getCodCarreira() {
        return codCarreira;
   }

   public void setCodCarreira(BigDecimal codCarreira) {
        this.codCarreira = codCarreira;
   }

   public BigDecimal getCodCategTrabCedido() {
        return codCategTrabCedido;
   }

   public void setCodCategTrabCedido(BigDecimal codCategTrabCedido) {
        this.codCategTrabCedido = codCategTrabCedido;
   }

   public BigDecimal getCodCidCertCivil() {
        return codCidCertCivil;
   }

   public void setCodCidCertCivil(BigDecimal codCidCertCivil) {
        this.codCidCertCivil = codCidCertCivil;
   }

   public BigDecimal getCodConvenio() {
        return codConvenio;
   }

   public void setCodConvenio(BigDecimal codConvenio) {
        this.codConvenio = codConvenio;
   }

   public BigDecimal getCodEmpDest() {
        return codEmpDest;
   }

   public void setCodEmpDest(BigDecimal codEmpDest) {
        this.codEmpDest = codEmpDest;
   }

   public BigDecimal getCodEmpFuncSubst() {
        return codEmpFuncSubst;
   }

   public void setCodEmpFuncSubst(BigDecimal codEmpFuncSubst) {
        this.codEmpFuncSubst = codEmpFuncSubst;
   }

   public BigDecimal getCodEmpFuncSup() {
        return codEmpFuncSup;
   }

   public void setCodEmpFuncSup(BigDecimal codEmpFuncSup) {
        this.codEmpFuncSup = codEmpFuncSup;
   }

   public BigDecimal getCodEmpRespNis() {
        return codEmpRespNis;
   }

   public void setCodEmpRespNis(BigDecimal codEmpRespNis) {
        this.codEmpRespNis = codEmpRespNis;
   }

   public BigDecimal getCodFuncDest() {
        return codFuncDest;
   }

   public void setCodFuncDest(BigDecimal codFuncDest) {
        this.codFuncDest = codFuncDest;
   }

   public BigDecimal getCodFuncSubst() {
        return codFuncSubst;
   }

   public void setCodFuncSubst(BigDecimal codFuncSubst) {
        this.codFuncSubst = codFuncSubst;
   }

   public BigDecimal getCodFuncSup() {
        return codFuncSup;
   }

   public void setCodFuncSup(BigDecimal codFuncSup) {
        this.codFuncSup = codFuncSup;
   }

   public BigDecimal getCodGrupoHorario() {
        return codGrupoHorario;
   }

   public void setCodGrupoHorario(BigDecimal codGrupoHorario) {
        this.codGrupoHorario = codGrupoHorario;
   }

   public String getCodMotDesligTransf() {
        return codMotDesligTransf;
   }

   public void setCodMotDesligTransf(String codMotDesligTransf) {
        this.codMotDesligTransf = codMotDesligTransf;
   }

   public BigDecimal getCodNivel() {
        return codNivel;
   }

   public void setCodNivel(BigDecimal codNivel) {
        this.codNivel = codNivel;
   }

   public BigDecimal getCodTpr() {
        return codTpr;
   }

   public void setCodTpr(BigDecimal codTpr) {
        this.codTpr = codTpr;
   }

   public String getCompensaSabado() {
        return compensaSabado;
   }

   public void setCompensaSabado(String compensaSabado) {
        this.compensaSabado = compensaSabado;
   }

   public BigDecimal getCompSalario() {
        return compSalario;
   }

   public void setCompSalario(BigDecimal compSalario) {
        this.compSalario = compSalario;
   }

   public String getContratoSusp() {
        return contratoSusp;
   }

   public void setContratoSusp(String contratoSusp) {
        this.contratoSusp = contratoSusp;
   }

   public BigDecimal getContTrabTemp() {
        return contTrabTemp;
   }

   public void setContTrabTemp(BigDecimal contTrabTemp) {
        this.contTrabTemp = contTrabTemp;
   }

   public String getCpfAnt() {
        return cpfAnt;
   }

   public void setCpfAnt(String cpfAnt) {
        this.cpfAnt = cpfAnt;
   }

   public String getCpfSubstituido() {
        return cpfSubstituido;
   }

   public void setCpfSubstituido(String cpfSubstituido) {
        this.cpfSubstituido = cpfSubstituido;
   }

   public String getCrmMedicoAso() {
        return crmMedicoAso;
   }

   public void setCrmMedicoAso(String crmMedicoAso) {
        this.crmMedicoAso = crmMedicoAso;
   }

   public BigDecimal getDiasAvisoPrevio() {
        return diasAvisoPrevio;
   }

   public void setDiasAvisoPrevio(BigDecimal diasAvisoPrevio) {
        this.diasAvisoPrevio = diasAvisoPrevio;
   }

   public BigDecimal getDiasEmGrupoHr() {
        return diasEmGrupoHr;
   }

   public void setDiasEmGrupoHr(BigDecimal diasEmGrupoHr) {
        this.diasEmGrupoHr = diasEmGrupoHr;
   }

   public String getDispensaPonto() {
        return dispensaPonto;
   }

   public void setDispensaPonto(String dispensaPonto) {
        this.dispensaPonto = dispensaPonto;
   }

   public String getDispPerExp() {
        return dispPerExp;
   }

   public void setDispPerExp(String dispPerExp) {
        this.dispPerExp = dispPerExp;
   }

   public String getDscAtivDes() {
        return dscAtivDes;
   }

   public void setDscAtivDes(String dscAtivDes) {
        this.dscAtivDes = dscAtivDes;
   }

   public Timestamp getDtAdmEmpCed() {
        return dtAdmEmpCed;
   }

   public void setDtAdmEmpCed(Timestamp dtAdmEmpCed) {
        this.dtAdmEmpCed = dtAdmEmpCed;
   }

   public Timestamp getDtAltCpf() {
        return dtAltCpf;
   }

   public void setDtAltCpf(Timestamp dtAltCpf) {
        this.dtAltCpf = dtAltCpf;
   }

   public Timestamp getDtAso() {
        return dtAso;
   }

   public void setDtAso(Timestamp dtAso) {
        this.dtAso = dtAso;
   }

   public Timestamp getDtEmiCertCivil() {
        return dtEmiCertCivil;
   }

   public void setDtEmiCertCivil(Timestamp dtEmiCertCivil) {
        this.dtEmiCertCivil = dtEmiCertCivil;
   }

   public Timestamp getDtEmiPporte() {
        return dtEmiPporte;
   }

   public void setDtEmiPporte(Timestamp dtEmiPporte) {
        this.dtEmiPporte = dtEmiPporte;
   }

   public Timestamp getDtEsocial2205() {
        return dtEsocial2205;
   }

   public void setDtEsocial2205(Timestamp dtEsocial2205) {
        this.dtEsocial2205 = dtEsocial2205;
   }

   public Timestamp getDtEsocial2206() {
        return dtEsocial2206;
   }

   public void setDtEsocial2206(Timestamp dtEsocial2206) {
        this.dtEsocial2206 = dtEsocial2206;
   }

   public Timestamp getDtExpOc() {
        return dtExpOc;
   }

   public void setDtExpOc(Timestamp dtExpOc) {
        this.dtExpOc = dtExpOc;
   }

   public Timestamp getDtFimQuarentena() {
        return dtFimQuarentena;
   }

   public void setDtFimQuarentena(Timestamp dtFimQuarentena) {
        this.dtFimQuarentena = dtFimQuarentena;
   }

   public Timestamp getDtIncEsocial() {
        return dtIncEsocial;
   }

   public void setDtIncEsocial(Timestamp dtIncEsocial) {
        this.dtIncEsocial = dtIncEsocial;
   }

   public Timestamp getDtIniGrupoHr() {
        return dtIniGrupoHr;
   }

   public void setDtIniGrupoHr(Timestamp dtIniGrupoHr) {
        this.dtIniGrupoHr = dtIniGrupoHr;
   }

   public Timestamp getDtLaudoRra() {
        return dtLaudoRra;
   }

   public void setDtLaudoRra(Timestamp dtLaudoRra) {
        this.dtLaudoRra = dtLaudoRra;
   }

   public Timestamp getDtLoteNis() {
        return dtLoteNis;
   }

   public void setDtLoteNis(Timestamp dtLoteNis) {
        this.dtLoteNis = dtLoteNis;
   }

   public Timestamp getDtQuitacao() {
        return dtQuitacao;
   }

   public void setDtQuitacao(Timestamp dtQuitacao) {
        this.dtQuitacao = dtQuitacao;
   }

   public Timestamp getDtTermino() {
        return dtTermino;
   }

   public void setDtTermino(Timestamp dtTermino) {
        this.dtTermino = dtTermino;
   }

   public Timestamp getDtTransfDest() {
        return dtTransfDest;
   }

   public void setDtTransfDest(Timestamp dtTransfDest) {
        this.dtTransfDest = dtTransfDest;
   }

   public Timestamp getDtUltEnvEsocial() {
        return dtUltEnvEsocial;
   }

   public void setDtUltEnvEsocial(Timestamp dtUltEnvEsocial) {
        this.dtUltEnvEsocial = dtUltEnvEsocial;
   }

   public Timestamp getDtValOc() {
        return dtValOc;
   }

   public void setDtValOc(Timestamp dtValOc) {
        this.dtValOc = dtValOc;
   }

   public Timestamp getDtValPporte() {
        return dtValPporte;
   }

   public void setDtValPporte(Timestamp dtValPporte) {
        this.dtValPporte = dtValPporte;
   }

   public Timestamp getDtVencExp1Or() {
        return dtVencExp1Or;
   }

   public void setDtVencExp1Or(Timestamp dtVencExp1Or) {
        this.dtVencExp1Or = dtVencExp1Or;
   }

   public Timestamp getDtVencExp2Or() {
        return dtVencExp2Or;
   }

   public void setDtVencExp2Or(Timestamp dtVencExp2Or) {
        this.dtVencExp2Or = dtVencExp2Or;
   }

   public Timestamp getDtVincEmpAnt() {
        return dtVincEmpAnt;
   }

   public void setDtVincEmpAnt(Timestamp dtVincEmpAnt) {
        this.dtVincEmpAnt = dtVincEmpAnt;
   }

   public String getEmissorPporte() {
        return emissorPporte;
   }

   public void setEmissorPporte(String emissorPporte) {
        this.emissorPporte = emissorPporte;
   }

   public String getEnvEsocial() {
        return envEsocial;
   }

   public void setEnvEsocial(String envEsocial) {
        this.envEsocial = envEsocial;
   }

   public Timestamp getFimValeSocial() {
        return fimValeSocial;
   }

   public void setFimValeSocial(Timestamp fimValeSocial) {
        this.fimValeSocial = fimValeSocial;
   }

   public String getIdConsig() {
        return idConsig;
   }

   public void setIdConsig(String idConsig) {
        this.idConsig = idConsig;
   }

   public BigDecimal getIndCumprParc() {
        return indCumprParc;
   }

   public void setIndCumprParc(BigDecimal indCumprParc) {
        this.indCumprParc = indCumprParc;
   }

   public BigDecimal getIndMv() {
        return indMv;
   }

   public void setIndMv(BigDecimal indMv) {
        this.indMv = indMv;
   }

   public String getIndNif() {
        return indNif;
   }

   public void setIndNif(String indNif) {
        this.indNif = indNif;
   }

   public String getInfoCota() {
        return infoCota;
   }

   public void setInfoCota(String infoCota) {
        this.infoCota = infoCota;
   }

   public BigDecimal getInfoOnus() {
        return infoOnus;
   }

   public void setInfoOnus(BigDecimal infoOnus) {
        this.infoOnus = infoOnus;
   }

   public Timestamp getIniValeSocial() {
        return iniValeSocial;
   }

   public void setIniValeSocial(Timestamp iniValeSocial) {
        this.iniValeSocial = iniValeSocial;
   }

   public String getInsConsig() {
        return insConsig;
   }

   public void setInsConsig(String insConsig) {
        this.insConsig = insConsig;
   }

   public String getJornadaEspProf() {
        return jornadaEspProf;
   }

   public void setJornadaEspProf(String jornadaEspProf) {
        this.jornadaEspProf = jornadaEspProf;
   }

   public BigDecimal getJornadaProf() {
        return jornadaProf;
   }

   public void setJornadaProf(BigDecimal jornadaProf) {
        this.jornadaProf = jornadaProf;
   }

   public String getJustContr() {
        return justContr;
   }

   public void setJustContr(String justContr) {
        this.justContr = justContr;
   }

   public String getJustProrr() {
        return justProrr;
   }

   public void setJustProrr(String justProrr) {
        this.justProrr = justProrr;
   }

   public BigDecimal getMatricAnt() {
        return matricAnt;
   }

   public void setMatricAnt(BigDecimal matricAnt) {
        this.matricAnt = matricAnt;
   }

   public String getMatriculaEmpAnt() {
        return matriculaEmpAnt;
   }

   public void setMatriculaEmpAnt(String matriculaEmpAnt) {
        this.matriculaEmpAnt = matriculaEmpAnt;
   }

   public String getMatriculaEmpCed() {
        return matriculaEmpCed;
   }

   public void setMatriculaEmpCed(String matriculaEmpCed) {
        this.matriculaEmpCed = matriculaEmpCed;
   }

   public String getMatriculaOld() {
        return matriculaOld;
   }

   public void setMatriculaOld(String matriculaOld) {
        this.matriculaOld = matriculaOld;
   }

   public String getMedicoAso() {
        return medicoAso;
   }

   public void setMedicoAso(String medicoAso) {
        this.medicoAso = medicoAso;
   }

   public String getMei() {
        return mei;
   }

   public void setMei(String mei) {
        this.mei = mei;
   }

   public String getMeTerg() {
        return meTerg;
   }

   public void setMeTerg(String meTerg) {
        this.meTerg = meTerg;
   }

   public BigDecimal getMtvDesligTsv() {
        return mtvDesligTsv;
   }

   public void setMtvDesligTsv(BigDecimal mtvDesligTsv) {
        this.mtvDesligTsv = mtvDesligTsv;
   }

   public String getNifBenef() {
        return nifBenef;
   }

   public void setNifBenef(String nifBenef) {
        this.nifBenef = nifBenef;
   }

   public String getNisEnviado() {
        return nisEnviado;
   }

   public void setNisEnviado(String nisEnviado) {
        this.nisEnviado = nisEnviado;
   }

   public String getNmSocial() {
        return nmSocial;
   }

   public void setNmSocial(String nmSocial) {
        this.nmSocial = nmSocial;
   }

   public String getNomeArqHomologNet() {
        return nomeArqHomologNet;
   }

   public void setNomeArqHomologNet(String nomeArqHomologNet) {
        this.nomeArqHomologNet = nomeArqHomologNet;
   }

   public String getNovoEmprego() {
        return novoEmprego;
   }

   public void setNovoEmprego(String novoEmprego) {
        this.novoEmprego = novoEmprego;
   }

   public String getNrCertObito() {
        return nrCertObito;
   }

   public void setNrCertObito(String nrCertObito) {
        this.nrCertObito = nrCertObito;
   }

   public String getNrContr() {
        return nrContr;
   }

   public void setNrContr(String nrContr) {
        this.nrContr = nrContr;
   }

   public String getNrInscEstabVinc() {
        return nrInscEstabVinc;
   }

   public void setNrInscEstabVinc(String nrInscEstabVinc) {
        this.nrInscEstabVinc = nrInscEstabVinc;
   }

   public String getNrInscTomador() {
        return nrInscTomador;
   }

   public void setNrInscTomador(String nrInscTomador) {
        this.nrInscTomador = nrInscTomador;
   }

   public String getNroC() {
        return nroC;
   }

   public void setNroC(String nroC) {
        this.nroC = nroC;
   }

   public String getNroCertCivil() {
        return nroCertCivil;
   }

   public void setNroCertCivil(String nroCertCivil) {
        this.nroCertCivil = nroCertCivil;
   }

   public String getNroFolhaReg() {
        return nroFolhaReg;
   }

   public void setNroFolhaReg(String nroFolhaReg) {
        this.nroFolhaReg = nroFolhaReg;
   }

   public String getNroLivroReg() {
        return nroLivroReg;
   }

   public void setNroLivroReg(String nroLivroReg) {
        this.nroLivroReg = nroLivroReg;
   }

   public String getNroPassaporte() {
        return nroPassaporte;
   }

   public void setNroPassaporte(String nroPassaporte) {
        this.nroPassaporte = nroPassaporte;
   }

   public String getNroProcessoRra() {
        return nroProcessoRra;
   }

   public void setNroProcessoRra(String nroProcessoRra) {
        this.nroProcessoRra = nroProcessoRra;
   }

   public BigDecimal getNumLoteNis() {
        return numLoteNis;
   }

   public void setNumLoteNis(BigDecimal numLoteNis) {
        this.numLoteNis = numLoteNis;
   }

   public BigDecimal getNuProcessoJud() {
        return nuProcessoJud;
   }

   public void setNuProcessoJud(BigDecimal nuProcessoJud) {
        this.nuProcessoJud = nuProcessoJud;
   }

   public BigDecimal getNuProcessoTrab() {
        return nuProcessoTrab;
   }

   public void setNuProcessoTrab(BigDecimal nuProcessoTrab) {
        this.nuProcessoTrab = nuProcessoTrab;
   }

   public BigDecimal getNuRequisicao() {
        return nuRequisicao;
   }

   public void setNuRequisicao(BigDecimal nuRequisicao) {
        this.nuRequisicao = nuRequisicao;
   }

   public String getObjDet() {
        return objDet;
   }

   public void setObjDet(String objDet) {
        this.objDet = objDet;
   }

   public String getObsAltCpf() {
        return obsAltCpf;
   }

   public void setObsAltCpf(String obsAltCpf) {
        this.obsAltCpf = obsAltCpf;
   }

   public String getObsEmpAnt() {
        return obsEmpAnt;
   }

   public void setObsEmpAnt(String obsEmpAnt) {
        this.obsEmpAnt = obsEmpAnt;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public String getObsVariavel() {
        return obsVariavel;
   }

   public void setObsVariavel(String obsVariavel) {
        this.obsVariavel = obsVariavel;
   }

   public String getCnpjEmpCed() {
        return cnpjEmpCed;
   }

   public void setCnpjEmpCed(String cnpjEmpCed) {
        this.cnpjEmpCed = cnpjEmpCed;
   }

   public BigDecimal getOrdemGrupoHr() {
        return ordemGrupoHr;
   }

   public void setOrdemGrupoHr(BigDecimal ordemGrupoHr) {
        this.ordemGrupoHr = ordemGrupoHr;
   }

   public String getOrgaoOc() {
        return orgaoOc;
   }

   public void setOrgaoOc(String orgaoOc) {
        this.orgaoOc = orgaoOc;
   }

   public BigDecimal getPercInsal() {
        return percInsal;
   }

   public void setPercInsal(BigDecimal percInsal) {
        this.percInsal = percInsal;
   }

   public BigDecimal getPercPeric() {
        return percPeric;
   }

   public void setPercPeric(BigDecimal percPeric) {
        this.percPeric = percPeric;
   }

   public String getPertenceDp() {
        return pertenceDp;
   }

   public void setPertenceDp(String pertenceDp) {
        this.pertenceDp = pertenceDp;
   }

   public String getPossuiRra() {
        return possuiRra;
   }

   public void setPossuiRra(String possuiRra) {
        this.possuiRra = possuiRra;
   }

   public String getProvisao13() {
        return provisao13;
   }

   public void setProvisao13(String provisao13) {
        this.provisao13 = provisao13;
   }

   public String getProvisaoFerias() {
        return provisaoFerias;
   }

   public void setProvisaoFerias(String provisaoFerias) {
        this.provisaoFerias = provisaoFerias;
   }

   public BigDecimal getQuemPagaRra() {
        return quemPagaRra;
   }

   public void setQuemPagaRra(BigDecimal quemPagaRra) {
        this.quemPagaRra = quemPagaRra;
   }

   public String getReciboEsocial() {
        return reciboEsocial;
   }

   public void setReciboEsocial(String reciboEsocial) {
        this.reciboEsocial = reciboEsocial;
   }

   public BigDecimal getRemunBase() {
        return remunBase;
   }

   public void setRemunBase(BigDecimal remunBase) {
        this.remunBase = remunBase;
   }

   public BigDecimal getRemuneracaoMesAnt() {
        return remuneracaoMesAnt;
   }

   public void setRemuneracaoMesAnt(BigDecimal remuneracaoMesAnt) {
        this.remuneracaoMesAnt = remuneracaoMesAnt;
   }

   public BigDecimal getSalAjustadoSind() {
        return salAjustadoSind;
   }

   public void setSalAjustadoSind(BigDecimal salAjustadoSind) {
        this.salAjustadoSind = salAjustadoSind;
   }

   public BigDecimal getSalBaseAnterior() {
        return salBaseAnterior;
   }

   public void setSalBaseAnterior(BigDecimal salBaseAnterior) {
        this.salBaseAnterior = salBaseAnterior;
   }

   public BigDecimal getSalProfessor() {
        return salProfessor;
   }

   public void setSalProfessor(BigDecimal salProfessor) {
        this.salProfessor = salProfessor;
   }

   public String getSegDesemprego() {
        return segDesemprego;
   }

   public void setSegDesemprego(String segDesemprego) {
        this.segDesemprego = segDesemprego;
   }

   public BigDecimal getSemanasPorMes() {
        return semanasPorMes;
   }

   public void setSemanasPorMes(BigDecimal semanasPorMes) {
        this.semanasPorMes = semanasPorMes;
   }

   public String getSemIntegral() {
        return semIntegral;
   }

   public void setSemIntegral(String semIntegral) {
        this.semIntegral = semIntegral;
   }

   public String getSitEsocial() {
        return sitEsocial;
   }

   public void setSitEsocial(String sitEsocial) {
        this.sitEsocial = sitEsocial;
   }

   public String getStep() {
        return step;
   }

   public void setStep(String step) {
        this.step = step;
   }

   public String getSuspExpAfast() {
        return suspExpAfast;
   }

   public void setSuspExpAfast(String suspExpAfast) {
        this.suspExpAfast = suspExpAfast;
   }

   public String getTelMedicoAso() {
        return telMedicoAso;
   }

   public void setTelMedicoAso(String telMedicoAso) {
        this.telMedicoAso = telMedicoAso;
   }

   public String getTemContribSindical() {
        return temContribSindical;
   }

   public void setTemContribSindical(String temContribSindical) {
        this.temContribSindical = temContribSindical;
   }

   public String getTemDescAssist() {
        return temDescAssist;
   }

   public void setTemDescAssist(String temDescAssist) {
        this.temDescAssist = temDescAssist;
   }

   public String getTempoParcial() {
        return tempoParcial;
   }

   public void setTempoParcial(String tempoParcial) {
        this.tempoParcial = tempoParcial;
   }

   public String getTipCertidao() {
        return tipCertidao;
   }

   public void setTipCertidao(String tipCertidao) {
        this.tipCertidao = tipCertidao;
   }

   public BigDecimal getTpInclContr() {
        return tpInclContr;
   }

   public void setTpInclContr(BigDecimal tpInclContr) {
        this.tpInclContr = tpInclContr;
   }

   public BigDecimal getTpInscEstabVinc() {
        return tpInscEstabVinc;
   }

   public void setTpInscEstabVinc(BigDecimal tpInscEstabVinc) {
        this.tpInscEstabVinc = tpInscEstabVinc;
   }

   public BigDecimal getTpInscTomador() {
        return tpInscTomador;
   }

   public void setTpInscTomador(BigDecimal tpInscTomador) {
        this.tpInscTomador = tpInscTomador;
   }

   public BigDecimal getTpRegPrevCed() {
        return tpRegPrevCed;
   }

   public void setTpRegPrevCed(BigDecimal tpRegPrevCed) {
        this.tpRegPrevCed = tpRegPrevCed;
   }

   public BigDecimal getTpRegTrabCed() {
        return tpRegTrabCed;
   }

   public void setTpRegTrabCed(BigDecimal tpRegTrabCed) {
        this.tpRegTrabCed = tpRegTrabCed;
   }

   public String getTrabAposent() {
        return trabAposent;
   }

   public void setTrabAposent(String trabAposent) {
        this.trabAposent = trabAposent;
   }

   public String getUfCrmMedAso() {
        return ufCrmMedAso;
   }

   public void setUfCrmMedAso(String ufCrmMedAso) {
        this.ufCrmMedAso = ufCrmMedAso;
   }

   public BigDecimal getUfPporte() {
        return ufPporte;
   }

   public void setUfPporte(BigDecimal ufPporte) {
        this.ufPporte = ufPporte;
   }

   public BigDecimal getCodCategEsocial() {
        return codCategEsocial;
   }

   public void setCodCategEsocial(BigDecimal codCategEsocial) {
        this.codCategEsocial = codCategEsocial;
   }

   public BigDecimal getCodCidRic() {
        return codCidRic;
   }

   public void setCodCidRic(BigDecimal codCidRic) {
        this.codCidRic = codCidRic;
   }

   public String getComplementOrg() {
        return complementOrg;
   }

   public void setComplementOrg(String complementOrg) {
        this.complementOrg = complementOrg;
   }

   public Timestamp getDtEmiRic() {
        return dtEmiRic;
   }

   public void setDtEmiRic(Timestamp dtEmiRic) {
        this.dtEmiRic = dtEmiRic;
   }

   public Timestamp getDtExpCnh() {
        return dtExpCnh;
   }

   public void setDtExpCnh(Timestamp dtExpCnh) {
        this.dtExpCnh = dtExpCnh;
   }

   public String getNroRic() {
        return nroRic;
   }

   public void setNroRic(String nroRic) {
        this.nroRic = nroRic;
   }

   public String getOrgaoRic() {
        return orgaoRic;
   }

   public void setOrgaoRic(String orgaoRic) {
        this.orgaoRic = orgaoRic;
   }

   public BigDecimal getUfCnh() {
        return ufCnh;
   }

   public void setUfCnh(BigDecimal ufCnh) {
        this.ufCnh = ufCnh;
   }

   public BigDecimal getUfRg() {
        return ufRg;
   }

   public void setUfRg(BigDecimal ufRg) {
        this.ufRg = ufRg;
   }

   public BigDecimal getUsuVpjSup() {
        return usuVpjSup;
   }

   public void setUsuVpjSup(BigDecimal usuVpjSup) {
        this.usuVpjSup = usuVpjSup;
   }

   public String getAprendizGravida() {
        return aprendizGravida;
   }

   public void setAprendizGravida(String aprendizGravida) {
        this.aprendizGravida = aprendizGravida;
   }

   public String getCadIni() {
        return cadIni;
   }

   public void setCadIni(String cadIni) {
        this.cadIni = cadIni;
   }

   public String getCagedAdm() {
        return cagedAdm;
   }

   public void setCagedAdm(String cagedAdm) {
        this.cagedAdm = cagedAdm;
   }

   public String getCaixaPostal() {
        return caixaPostal;
   }

   public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
   }

   public String getCartorio() {
        return cartorio;
   }

   public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
   }

   public String getCnpjDestTransf() {
        return cnpjDestTransf;
   }

   public void setCnpjDestTransf(String cnpjDestTransf) {
        this.cnpjDestTransf = cnpjDestTransf;
   }

   public String getCnpjEmpAnt() {
        return cnpjEmpAnt;
   }

   public void setCnpjEmpAnt(String cnpjEmpAnt) {
        this.cnpjEmpAnt = cnpjEmpAnt;
   }

   public BigDecimal getCodPaisNac() {
        return codPaisNac;
   }

   public void setCodPaisNac(BigDecimal codPaisNac) {
        this.codPaisNac = codPaisNac;
   }

   public Timestamp getDtFimRemun() {
        return dtFimRemun;
   }

   public void setDtFimRemun(Timestamp dtFimRemun) {
        this.dtFimRemun = dtFimRemun;
   }

   public String getEndFiscExt() {
        return endFiscExt;
   }

   public void setEndFiscExt(String endFiscExt) {
        this.endFiscExt = endFiscExt;
   }

   public BigDecimal getFormTribu() {
        return formTribu;
   }

   public void setFormTribu(BigDecimal formTribu) {
        this.formTribu = formTribu;
   }

   public BigDecimal getIndSitRemunDeslig() {
        return indSitRemunDeslig;
   }

   public void setIndSitRemunDeslig(BigDecimal indSitRemunDeslig) {
        this.indSitRemunDeslig = indSitRemunDeslig;
   }

   public BigDecimal getMotExpatriado() {
        return motExpatriado;
   }

   public void setMotExpatriado(BigDecimal motExpatriado) {
        this.motExpatriado = motExpatriado;
   }

   public String getCondIngEstrang() {
        return condIngEstrang;
   }

   public void setCondIngEstrang(String condIngEstrang) {
        this.condIngEstrang = condIngEstrang;
   }

   public String getTmpResidTrabEstrang() {
        return tmpResidTrabEstrang;
   }

   public void setTmpResidTrabEstrang(String tmpResidTrabEstrang) {
        this.tmpResidTrabEstrang = tmpResidTrabEstrang;
   }

   public String getNumProcTsvE() {
        return numProcTsvE;
   }

   public void setNumProcTsvE(String numProcTsvE) {
        this.numProcTsvE = numProcTsvE;
   }

   public String getTransfExterna() {
        return transfExterna;
   }

   public void setTransfExterna(String transfExterna) {
        this.transfExterna = transfExterna;
   }

   public String getCtpsDigital() {
        return ctpsDigital;
   }

   public void setCtpsDigital(String ctpsDigital) {
        this.ctpsDigital = ctpsDigital;
   }

   public String getSituacaoAnt() {
        return situacaoAnt;
   }

   public void setSituacaoAnt(String situacaoAnt) {
        this.situacaoAnt = situacaoAnt;
   }

   public String getAcessoPortalRh() {
        return acessoPortalRh;
   }

   public void setAcessoPortalRh(String acessoPortalRh) {
        this.acessoPortalRh = acessoPortalRh;
   }

   public String getAfastFgtsAnt() {
        return afastFgtsAnt;
   }

   public void setAfastFgtsAnt(String afastFgtsAnt) {
        this.afastFgtsAnt = afastFgtsAnt;
   }

   public BigDecimal getAfastRaisAnt() {
        return afastRaisAnt;
   }

   public void setAfastRaisAnt(BigDecimal afastRaisAnt) {
        this.afastRaisAnt = afastRaisAnt;
   }

   public BigDecimal getCausaAfastAnt() {
        return causaAfastAnt;
   }

   public void setCausaAfastAnt(BigDecimal causaAfastAnt) {
        this.causaAfastAnt = causaAfastAnt;
   }

   public String getCnpjEntQual() {
        return cnpjEntQual;
   }

   public void setCnpjEntQual(String cnpjEntQual) {
        this.cnpjEntQual = cnpjEntQual;
   }

   public String getCnpjPrat() {
        return cnpjPrat;
   }

   public void setCnpjPrat(String cnpjPrat) {
        this.cnpjPrat = cnpjPrat;
   }

   public BigDecimal getCodCategEsocialAnt() {
        return codCategEsocialAnt;
   }

   public void setCodCategEsocialAnt(BigDecimal codCategEsocialAnt) {
        this.codCategEsocialAnt = codCategEsocialAnt;
   }

   public BigDecimal getCodTprJud() {
        return codTprJud;
   }

   public void setCodTprJud(BigDecimal codTprJud) {
        this.codTprJud = codTprJud;
   }

   public BigDecimal getCodUsuSnk() {
        return codUsuSnk;
   }

   public void setCodUsuSnk(BigDecimal codUsuSnk) {
        this.codUsuSnk = codUsuSnk;
   }

   public Timestamp getDtAdmJud() {
        return dtAdmJud;
   }

   public void setDtAdmJud(Timestamp dtAdmJud) {
        this.dtAdmJud = dtAdmJud;
   }

   public Timestamp getDtAltS2200() {
        return dtAltS2200;
   }

   public void setDtAltS2200(Timestamp dtAltS2200) {
        this.dtAltS2200 = dtAltS2200;
   }

   public Timestamp getDtAltS2299() {
        return dtAltS2299;
   }

   public void setDtAltS2299(Timestamp dtAltS2299) {
        this.dtAltS2299 = dtAltS2299;
   }

   public Timestamp getDtDemJud() {
        return dtDemJud;
   }

   public void setDtDemJud(Timestamp dtDemJud) {
        this.dtDemJud = dtDemJud;
   }

   public Timestamp getDtSentProcTrab() {
        return dtSentProcTrab;
   }

   public void setDtSentProcTrab(Timestamp dtSentProcTrab) {
        this.dtSentProcTrab = dtSentProcTrab;
   }

   public String getIdentidadeGenero() {
        return identidadeGenero;
   }

   public void setIdentidadeGenero(String identidadeGenero) {
        this.identidadeGenero = identidadeGenero;
   }

   public BigDecimal getIndAdmissaoAnt() {
        return indAdmissaoAnt;
   }

   public void setIndAdmissaoAnt(BigDecimal indAdmissaoAnt) {
        this.indAdmissaoAnt = indAdmissaoAnt;
   }

   public String getMatAnotJud() {
        return matAnotJud;
   }

   public void setMatAnotJud(String matAnotJud) {
        this.matAnotJud = matAnotJud;
   }

   public String getMotDesligEsocial() {
        return motDesligEsocial;
   }

   public void setMotDesligEsocial(String motDesligEsocial) {
        this.motDesligEsocial = motDesligEsocial;
   }

   public String getMotDesligEsocialAnt() {
        return motDesligEsocialAnt;
   }

   public void setMotDesligEsocialAnt(String motDesligEsocialAnt) {
        this.motDesligEsocialAnt = motDesligEsocialAnt;
   }

   public String getNatAtividade() {
        return natAtividade;
   }

   public void setNatAtividade(String natAtividade) {
        this.natAtividade = natAtividade;
   }

   public String getNatAtividadeAnt() {
        return natAtividadeAnt;
   }

   public void setNatAtividadeAnt(String natAtividadeAnt) {
        this.natAtividadeAnt = natAtividadeAnt;
   }

   public String getNrInscAprend() {
        return nrInscAprend;
   }

   public void setNrInscAprend(String nrInscAprend) {
        this.nrInscAprend = nrInscAprend;
   }

   public String getNrProcTrabAnt() {
        return nrProcTrabAnt;
   }

   public void setNrProcTrabAnt(String nrProcTrabAnt) {
        this.nrProcTrabAnt = nrProcTrabAnt;
   }

   public String getNrProcTrabDeslig() {
        return nrProcTrabDeslig;
   }

   public void setNrProcTrabDeslig(String nrProcTrabDeslig) {
        this.nrProcTrabDeslig = nrProcTrabDeslig;
   }

   public String getOrientacaoSexual() {
        return orientacaoSexual;
   }

   public void setOrientacaoSexual(String orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
   }

   public String getPossuiFilhos() {
        return possuiFilhos;
   }

   public void setPossuiFilhos(String possuiFilhos) {
        this.possuiFilhos = possuiFilhos;
   }

   public String getPvd() {
        return pvd;
   }

   public void setPvd(String pvd) {
        this.pvd = pvd;
   }

   public String getReciboEsocial2200() {
        return reciboEsocial2200;
   }

   public void setReciboEsocial2200(String reciboEsocial2200) {
        this.reciboEsocial2200 = reciboEsocial2200;
   }

   public String getReciboEsocial2205() {
        return reciboEsocial2205;
   }

   public void setReciboEsocial2205(String reciboEsocial2205) {
        this.reciboEsocial2205 = reciboEsocial2205;
   }

   public String getReciboEsocial2206() {
        return reciboEsocial2206;
   }

   public void setReciboEsocial2206(String reciboEsocial2206) {
        this.reciboEsocial2206 = reciboEsocial2206;
   }

   public String getTemUsuSnk() {
        return temUsuSnk;
   }

   public void setTemUsuSnk(String temUsuSnk) {
        this.temUsuSnk = temUsuSnk;
   }

   public BigDecimal getTpInscAprend() {
        return tpInscAprend;
   }

   public void setTpInscAprend(BigDecimal tpInscAprend) {
        this.tpInscAprend = tpInscAprend;
   }

   public String getNrProcTrab() {
        return nrProcTrab;
   }

   public void setNrProcTrab(String nrProcTrab) {
        this.nrProcTrab = nrProcTrab;
   }

   public String getObservacaoMp() {
        return observacaoMp;
   }

   public void setObservacaoMp(String observacaoMp) {
        this.observacaoMp = observacaoMp;
   }

   public BigDecimal getPerRedCpu() {
        return perRedCpu;
   }

   public void setPerRedCpu(BigDecimal perRedCpu) {
        this.perRedCpu = perRedCpu;
   }

   public String getReplider() {
        return replider;
   }

   public void setReplider(String replider) {
        this.replider = replider;
   }

   public BigDecimal getSalBaseCpu() {
        return salBaseCpu;
   }

   public void setSalBaseCpu(BigDecimal salBaseCpu) {
        this.salBaseCpu = salBaseCpu;
   }

   public BigDecimal getSalBaseRed() {
        return salBaseRed;
   }

   public void setSalBaseRed(BigDecimal salBaseRed) {
        this.salBaseRed = salBaseRed;
   }

   public String getSuspContrato() {
        return suspContrato;
   }

   public void setSuspContrato(String suspContrato) {
        this.suspContrato = suspContrato;
   }

   public Timestamp getDtDispensaPonto() {
        return dtDispensaPonto;
   }

   public void setDtDispensaPonto(Timestamp dtDispensaPonto) {
        this.dtDispensaPonto = dtDispensaPonto;
   }

   public BigDecimal getCodLocalPonto() {
        return codLocalPonto;
   }

   public void setCodLocalPonto(BigDecimal codLocalPonto) {
        this.codLocalPonto = codLocalPonto;
   }

   public String getValidado() {
        return validado;
   }

   public void setValidado(String validado) {
        this.validado = validado;
   }

   public String getTransfSemOnusCedente() {
        return transfSemOnusCedente;
   }

   public void setTransfSemOnusCedente(String transfSemOnusCedente) {
        this.transfSemOnusCedente = transfSemOnusCedente;
   }

   @Override
   public String getEntityName() {
        return "Funcionario";
   }

   @Override
   public Funcionario fromVO(DynamicVO vo) {
        this.dependConvMed = vo.asBigDecimal("DEPENDCONVMED");
        this.dependIrf = vo.asBigDecimal("DEPENDIRF");
        this.dependSalFam = vo.asBigDecimal("DEPENDSALFAM");
        this.diaApuraPonto = vo.asBigDecimal("DIAAPURAPONTO");
        this.diaCadPis = vo.asBigDecimal("DIACADPIS");
        this.diasFerias = vo.asBigDecimal("DIASFERIAS");
        this.ajudaComp = vo.asString("AJUDACOMP");
        this.aprendContrInd = vo.asString("APRENDCONTRIND");
        this.bloqueiaBatidaOnline = vo.asString("BLOQUEIABATIDAONLINE");
        this.codMadDem = vo.asBigDecimal("CODMADDEM");
        this.dtFimContrInt = vo.asTimestamp("DTFIMCONTRINT");
        this.dtFimRed = vo.asTimestamp("DTFIMRED");
        this.dtInicioRed = vo.asTimestamp("DTINICIORED");
        this.horasSemCpu = vo.asBigDecimal("HORASSEMCPU");
        this.horasSemRed = vo.asBigDecimal("HORASSEMRED");
        this.diasPeriodo1 = vo.asBigDecimal("DIASPERIODO1");
        this.diasPeriodo2 = vo.asBigDecimal("DIASPERIODO2");
        this.dirReciproco = vo.asString("DIRRECIPROCO");
        this.dtAdm = vo.asTimestamp("DTADM");
        this.dtAfastamento = vo.asTimestamp("DTAFASTAMENTO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.codSind = vo.asBigDecimal("CODSIND");
        this.codTomador = vo.asBigDecimal("CODTOMADOR");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.complemento = vo.asString("COMPLEMENTO");
        this.convMed = vo.asString("CONVMED");
        this.cpf = vo.asString("CPF");
        this.ctaFgts = vo.asString("CTAFGTS");
        this.deficienteFisico = vo.asString("DEFICIENTEFISICO");
        this.afastFgts = vo.asString("AFASTFGTS");
        this.afastRais = vo.asBigDecimal("AFASTRAIS");
        this.anoChegPais = vo.asBigDecimal("ANOCHEGPAIS");
        this.categoriaCnh = vo.asString("CATEGORIACNH");
        this.causaAfast = vo.asBigDecimal("CAUSAAFAST");
        this.celular = vo.asString("CELULAR");
        this.cep = vo.asString("CEP");
        this.cidNasc = vo.asBigDecimal("CIDNASC");
        this.codAdmFgts = vo.asString("CODADMFGTS");
        this.codAdmFgtsIi = vo.asString("CODADMFGTSII");
        this.codAge = vo.asString("CODAGE");
        this.codBai = vo.asBigDecimal("CODBAI");
        this.codBco = vo.asBigDecimal("CODBCO");
        this.codCargaHor = vo.asBigDecimal("CODCARGAHOR");
        this.codCargo = vo.asBigDecimal("CODCARGO");
        this.codCateg = vo.asBigDecimal("CODCATEG");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codCidTrab = vo.asBigDecimal("CODCIDTRAB");
        this.codCtAbco = vo.asString("CODCTABCO");
        this.codDep = vo.asBigDecimal("CODDEP");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEmpOrig = vo.asBigDecimal("CODEMPORIG");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codFuncao = vo.asBigDecimal("CODFUNCAO");
        this.codFuncOrig = vo.asBigDecimal("CODFUNCORIG");
        this.dtAvisoPrevio = vo.asTimestamp("DTAVISOPREVIO");
        this.dtCadPis = vo.asTimestamp("DTCADPIS");
        this.dtCarteiraSaude = vo.asTimestamp("DTCARTEIRASAUDE");
        this.dtCps = vo.asTimestamp("DTCPS");
        this.dtDem = vo.asTimestamp("DTDEM");
        this.dtNasc = vo.asTimestamp("DTNASC");
        this.dtOptFgts = vo.asTimestamp("DTOPTFGTS");
        this.dtRg = vo.asTimestamp("DTRG");
        this.dtTransferencia = vo.asTimestamp("DTTRANSFERENCIA");
        this.dtValPais = vo.asTimestamp("DTVALPAIS");
        this.dtVencExp1 = vo.asTimestamp("DTVENCEXP1");
        this.dtVencExp2 = vo.asTimestamp("DTVENCEXP2");
        this.email = vo.asString("EMAIL");
        this.estadoCivil = vo.asBigDecimal("ESTADOCIVIL");
        this.horasSem = vo.asBigDecimal("HORASSEM");
        this.identidade = vo.asString("IDENTIDADE");
        this.imagem = vo.asBlob("IMAGEM");
        this.matricula = vo.asBigDecimal("MATRICULA");
        this.mesDia = vo.asBigDecimal("MESDIA");
        this.nacionalidade = vo.asBigDecimal("NACIONALIDADE");
        this.nacionalPais = vo.asBigDecimal("NACIONALPAIS");
        this.nivEsc = vo.asBigDecimal("NIVESC");
        this.nomeFunc = vo.asString("NOMEFUNC");
        this.nomeMae = vo.asString("NOMEMAE");
        this.nomePai = vo.asString("NOMEPAI");
        this.nroCnh = vo.asString("NROCNH");
        this.nroReservista = vo.asString("NRORESERVISTA");
        this.numCartaoPonto = vo.asBigDecimal("NUMCARTAOPONTO");
        this.numCps = vo.asBigDecimal("NUMCPS");
        this.numEnd = vo.asString("NUMEND");
        this.orgaoRg = vo.asString("ORGAORG");
        this.partPat = vo.asString("PARTPAT");
        this.percAdiantamento = vo.asBigDecimal("PERCADIANTAMENTO");
        this.percConv = vo.asBigDecimal("PERCCONV");
        this.pis = vo.asString("PIS");
        this.primeiraCnh = vo.asTimestamp("PRIMEIRACNH");
        this.primeEmprego = vo.asString("PRIMEEMPREGO");
        this.racaFuncionario = vo.asBigDecimal("RACAFUNCIONARIO");
        this.regime = vo.asBigDecimal("REGIME");
        this.remuMinima = vo.asBigDecimal("REMUMINIMA");
        this.rne = vo.asString("RNE");
        this.salBase = vo.asBigDecimal("SALBASE");
        this.secaoEleitoral = vo.asBigDecimal("SECAOELEITORAL");
        this.senha = vo.asString("SENHA");
        this.serieCps = vo.asString("SERIECPS");
        this.sexo = vo.asString("SEXO");
        this.sindicalizado = vo.asString("SINDICALIZADO");
        this.sitPais = vo.asString("SITPAIS");
        this.sitSind = vo.asString("SITSIND");
        this.situacao = vo.asString("SITUACAO");
        this.telefone = vo.asString("TELEFONE");
        this.tipConta = vo.asString("TIPCONTA");
        this.tipDeficiencia = vo.asBigDecimal("TIPDEFICIENCIA");
        this.tipPonto = vo.asString("TIPPONTO");
        this.tipReceb = vo.asString("TIPRECEB");
        this.tipSal = vo.asString("TIPSAL");
        this.tipTab = vo.asString("TIPTAB");
        this.titEleitoral = vo.asString("TITELEITORAL");
        this.trabOutraEmp = vo.asString("TRABOUTRAEMP");
        this.ufCps = vo.asBigDecimal("UFCPS");
        this.vencimentoCnh = vo.asTimestamp("VENCIMENTOCNH");
        this.vinculo = vo.asBigDecimal("VINCULO");
        this.zonaEleitoral = vo.asBigDecimal("ZONAELEITORAL");
        this.codGrupoCtbz = vo.asBigDecimal("CODGRUPOCTBZ");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codSaq = vo.asBigDecimal("CODSAQ");
        this.casadoBr = vo.asString("CASADOBR");
        this.clasTrabEstrang = vo.asBigDecimal("CLASTRABESTRANG");
        this.dtChegPais = vo.asTimestamp("DTCHEGPAIS");
        this.dtExpRne = vo.asTimestamp("DTEXPRNE");
        this.dtNatural = vo.asTimestamp("DTNATURAL");
        this.filhosBr = vo.asString("FILHOSBR");
        this.indAdmissao = vo.asBigDecimal("INDADMISSAO");
        this.nroNatural = vo.asString("NRONATURAL");
        this.obsDeficiencia = vo.asString("OBSDEFICIENCIA");
        this.optFgts = vo.asBigDecimal("OPTFGTS");
        this.orgaoCnh = vo.asString("ORGAOCNH");
        this.orgaoRne = vo.asString("ORGAORNE");
        this.regimeJor = vo.asBigDecimal("REGIMEJOR");
        this.regimeTrab = vo.asBigDecimal("REGIMETRAB");
        this.codCarreira = vo.asBigDecimal("CODCARREIRA");
        this.codCategTrabCedido = vo.asBigDecimal("CODCATEGTRABCEDIDO");
        this.codCidCertCivil = vo.asBigDecimal("CODCIDCERTCIVIL");
        this.codConvenio = vo.asBigDecimal("CODCONVENIO");
        this.codEmpDest = vo.asBigDecimal("CODEMPDEST");
        this.codEmpFuncSubst = vo.asBigDecimal("CODEMPFUNCSUBST");
        this.codEmpFuncSup = vo.asBigDecimal("CODEMPFUNCSUP");
        this.codEmpRespNis = vo.asBigDecimal("CODEMPRESPNIS");
        this.codFuncDest = vo.asBigDecimal("CODFUNCDEST");
        this.codFuncSubst = vo.asBigDecimal("CODFUNCSUBST");
        this.codFuncSup = vo.asBigDecimal("CODFUNCSUP");
        this.codGrupoHorario = vo.asBigDecimal("CODGRUPOHORARIO");
        this.codMotDesligTransf = vo.asString("CODMOTDESLIGTRANSF");
        this.codNivel = vo.asBigDecimal("CODNIVEL");
        this.codTpr = vo.asBigDecimal("CODTPR");
        this.compensaSabado = vo.asString("COMPENSASABADO");
        this.compSalario = vo.asBigDecimal("COMPSALARIO");
        this.contratoSusp = vo.asString("CONTRATOSUSP");
        this.contTrabTemp = vo.asBigDecimal("CONTTRABTEMP");
        this.cpfAnt = vo.asString("CPFANT");
        this.cpfSubstituido = vo.asString("CPFSUBSTITUIDO");
        this.crmMedicoAso = vo.asString("CRMMEDICOASO");
        this.diasAvisoPrevio = vo.asBigDecimal("DIASAVISOPREVIO");
        this.diasEmGrupoHr = vo.asBigDecimal("DIASEMGRUPOHR");
        this.dispensaPonto = vo.asString("DISPENSAPONTO");
        this.dispPerExp = vo.asString("DISPPEREXP");
        this.dscAtivDes = vo.asString("DSCATIVDES");
        this.dtAdmEmpCed = vo.asTimestamp("DTADMEMPCED");
        this.dtAltCpf = vo.asTimestamp("DTALTCPF");
        this.dtAso = vo.asTimestamp("DTASO");
        this.dtEmiCertCivil = vo.asTimestamp("DTEMICERTCIVIL");
        this.dtEmiPporte = vo.asTimestamp("DTEMIPPORTE");
        this.dtEsocial2205 = vo.asTimestamp("DTESOCIAL2205");
        this.dtEsocial2206 = vo.asTimestamp("DTESOCIAL2206");
        this.dtExpOc = vo.asTimestamp("DTEXPOC");
        this.dtFimQuarentena = vo.asTimestamp("DTFIMQUARENTENA");
        this.dtIncEsocial = vo.asTimestamp("DTINCESOCIAL");
        this.dtIniGrupoHr = vo.asTimestamp("DTINIGRUPOHR");
        this.dtLaudoRra = vo.asTimestamp("DTLAUDORRA");
        this.dtLoteNis = vo.asTimestamp("DTLOTENIS");
        this.dtQuitacao = vo.asTimestamp("DTQUITACAO");
        this.dtTermino = vo.asTimestamp("DTTERMINO");
        this.dtTransfDest = vo.asTimestamp("DTTRANSFDEST");
        this.dtUltEnvEsocial = vo.asTimestamp("DTULTENVESOCIAL");
        this.dtValOc = vo.asTimestamp("DTVALOC");
        this.dtValPporte = vo.asTimestamp("DTVALPPORTE");
        this.dtVencExp1Or = vo.asTimestamp("DTVENCEXP1OR");
        this.dtVencExp2Or = vo.asTimestamp("DTVENCEXP2OR");
        this.dtVincEmpAnt = vo.asTimestamp("DTVINCEMPANT");
        this.emissorPporte = vo.asString("EMISSORPPORTE");
        this.envEsocial = vo.asString("ENVESOCIAL");
        this.fimValeSocial = vo.asTimestamp("FIMVALESOCIAL");
        this.idConsig = vo.asString("IDCONSIG");
        this.indCumprParc = vo.asBigDecimal("INDCUMPRPARC");
        this.indMv = vo.asBigDecimal("INDMV");
        this.indNif = vo.asString("INDNIF");
        this.infoCota = vo.asString("INFOCOTA");
        this.infoOnus = vo.asBigDecimal("INFOONUS");
        this.iniValeSocial = vo.asTimestamp("INIVALESOCIAL");
        this.insConsig = vo.asString("INSCONSIG");
        this.jornadaEspProf = vo.asString("JORNADAESPPROF");
        this.jornadaProf = vo.asBigDecimal("JORNADAPROF");
        this.justContr = vo.asString("JUSTCONTR");
        this.justProrr = vo.asString("JUSTPRORR");
        this.matricAnt = vo.asBigDecimal("MATRICANT");
        this.matriculaEmpAnt = vo.asString("MATRICULAEMPANT");
        this.matriculaEmpCed = vo.asString("MATRICULAEMPCED");
        this.matriculaOld = vo.asString("MATRICULAOLD");
        this.medicoAso = vo.asString("MEDICOASO");
        this.mei = vo.asString("MEI");
        this.meTerg = vo.asString("METERG");
        this.mtvDesligTsv = vo.asBigDecimal("MTVDESLIGTSV");
        this.nifBenef = vo.asString("NIFBENEF");
        this.nisEnviado = vo.asString("NISENVIADO");
        this.nmSocial = vo.asString("NMSOCIAL");
        this.nomeArqHomologNet = vo.asString("NOMEARQHOMOLOGNET");
        this.novoEmprego = vo.asString("NOVOEMPREGO");
        this.nrCertObito = vo.asString("NRCERTOBITO");
        this.nrContr = vo.asString("NRCONTR");
        this.nrInscEstabVinc = vo.asString("NRINSCESTABVINC");
        this.nrInscTomador = vo.asString("NRINSCTOMADOR");
        this.nroC = vo.asString("NROC");
        this.nroCertCivil = vo.asString("NROCERTCIVIL");
        this.nroFolhaReg = vo.asString("NROFOLHAREG");
        this.nroLivroReg = vo.asString("NROLIVROREG");
        this.nroPassaporte = vo.asString("NROPASSAPORTE");
        this.nroProcessoRra = vo.asString("NROPROCESSORRA");
        this.numLoteNis = vo.asBigDecimal("NUMLOTENIS");
        this.nuProcessoJud = vo.asBigDecimal("NUPROCESSOJUD");
        this.nuProcessoTrab = vo.asBigDecimal("NUPROCESSOTRAB");
        this.nuRequisicao = vo.asBigDecimal("NUREQUISICAO");
        this.objDet = vo.asString("OBJDET");
        this.obsAltCpf = vo.asString("OBSALTCPF");
        this.obsEmpAnt = vo.asString("OBSEMPANT");
        this.observacao = vo.asString("OBSERVACAO");
        this.obsVariavel = vo.asString("OBSVARIAVEL");
        this.cnpjEmpCed = vo.asString("CNPJEMPCED");
        this.ordemGrupoHr = vo.asBigDecimal("ORDEMGRUPOHR");
        this.orgaoOc = vo.asString("ORGAOOC");
        this.percInsal = vo.asBigDecimal("PERCINSAL");
        this.percPeric = vo.asBigDecimal("PERCPERIC");
        this.pertenceDp = vo.asString("PERTENCEDP");
        this.possuiRra = vo.asString("POSSUIRRA");
        this.provisao13 = vo.asString("PROVISAO13");
        this.provisaoFerias = vo.asString("PROVISAOFERIAS");
        this.quemPagaRra = vo.asBigDecimal("QUEMPAGARRA");
        this.reciboEsocial = vo.asString("RECIBOESOCIAL");
        this.remunBase = vo.asBigDecimal("REMUNBASE");
        this.remuneracaoMesAnt = vo.asBigDecimal("REMUNERACAOMESANT");
        this.salAjustadoSind = vo.asBigDecimal("SALAJUSTADOSIND");
        this.salBaseAnterior = vo.asBigDecimal("SALBASEANTERIOR");
        this.salProfessor = vo.asBigDecimal("SALPROFESSOR");
        this.segDesemprego = vo.asString("SEGDESEMPREGO");
        this.semanasPorMes = vo.asBigDecimal("SEMANASPORMES");
        this.semIntegral = vo.asString("SEMINTEGRAL");
        this.sitEsocial = vo.asString("SITESOCIAL");
        this.step = vo.asString("STEP");
        this.suspExpAfast = vo.asString("SUSPEXPAFAST");
        this.telMedicoAso = vo.asString("TELMEDICOASO");
        this.temContribSindical = vo.asString("TEMCONTRIBSINDICAL");
        this.temDescAssist = vo.asString("TEMDESCASSIST");
        this.tempoParcial = vo.asString("TEMPOPARCIAL");
        this.tipCertidao = vo.asString("TIPCERTIDAO");
        this.tpInclContr = vo.asBigDecimal("TPINCLCONTR");
        this.tpInscEstabVinc = vo.asBigDecimal("TPINSCESTABVINC");
        this.tpInscTomador = vo.asBigDecimal("TPINSCTOMADOR");
        this.tpRegPrevCed = vo.asBigDecimal("TPREGPREVCED");
        this.tpRegTrabCed = vo.asBigDecimal("TPREGTRABCED");
        this.trabAposent = vo.asString("TRABAPOSENT");
        this.ufCrmMedAso = vo.asString("UFCRMMEDASO");
        this.ufPporte = vo.asBigDecimal("UFPPORTE");
        this.codCategEsocial = vo.asBigDecimal("CODCATEGESOCIAL");
        this.codCidRic = vo.asBigDecimal("CODCIDRIC");
        this.complementOrg = vo.asString("COMPLEMENTORG");
        this.dtEmiRic = vo.asTimestamp("DTEMIRIC");
        this.dtExpCnh = vo.asTimestamp("DTEXPCNH");
        this.nroRic = vo.asString("NRORIC");
        this.orgaoRic = vo.asString("ORGAORIC");
        this.ufCnh = vo.asBigDecimal("UFCNH");
        this.ufRg = vo.asBigDecimal("UFRG");
        this.usuVpjSup = vo.asBigDecimal("USUVPJSUP");
        this.aprendizGravida = vo.asString("APRENDIZGRAVIDA");
        this.cadIni = vo.asString("CADINI");
        this.cagedAdm = vo.asString("CAGEDADM");
        this.caixaPostal = vo.asString("CAIXAPOSTAL");
        this.cartorio = vo.asString("CARTORIO");
        this.cnpjDestTransf = vo.asString("CNPJDESTTRANSF");
        this.cnpjEmpAnt = vo.asString("CNPJEMPANT");
        this.codPaisNac = vo.asBigDecimal("CODPAISNAC");
        this.dtFimRemun = vo.asTimestamp("DTFIMREMUN");
        this.endFiscExt = vo.asString("ENDFISCEXT");
        this.formTribu = vo.asBigDecimal("FORMTRIBU");
        this.indSitRemunDeslig = vo.asBigDecimal("INDSITREMUNDESLIG");
        this.motExpatriado = vo.asBigDecimal("MOTEXPATRIADO");
        this.condIngEstrang = vo.asString("CONDINGESTRANG");
        this.tmpResidTrabEstrang = vo.asString("TMPRESIDTRABESTRANG");
        this.numProcTsvE = vo.asString("NUMPROCTSVE");
        this.transfExterna = vo.asString("TRANSFEXTERNA");
        this.ctpsDigital = vo.asString("CTPSDIGITAL");
        this.situacaoAnt = vo.asString("SITUACAOANT");
        this.acessoPortalRh = vo.asString("ACESSOPORTALRH");
        this.afastFgtsAnt = vo.asString("AFASTFGTSANT");
        this.afastRaisAnt = vo.asBigDecimal("AFASTRAISANT");
        this.causaAfastAnt = vo.asBigDecimal("CAUSAAFASTANT");
        this.cnpjEntQual = vo.asString("CNPJENTQUAL");
        this.cnpjPrat = vo.asString("CNPJPRAT");
        this.codCategEsocialAnt = vo.asBigDecimal("CODCATEGESOCIALANT");
        this.codTprJud = vo.asBigDecimal("CODTPRJUD");
        this.codUsuSnk = vo.asBigDecimal("CODUSUSNK");
        this.dtAdmJud = vo.asTimestamp("DTADMJUD");
        this.dtAltS2200 = vo.asTimestamp("DTALTS2200");
        this.dtAltS2299 = vo.asTimestamp("DTALTS2299");
        this.dtDemJud = vo.asTimestamp("DTDEMJUD");
        this.dtSentProcTrab = vo.asTimestamp("DTSENTPROCTRAB");
        this.identidadeGenero = vo.asString("IDENTIDADEGENERO");
        this.indAdmissaoAnt = vo.asBigDecimal("INDADMISSAOANT");
        this.matAnotJud = vo.asString("MATANOTJUD");
        this.motDesligEsocial = vo.asString("MOTDESLIGESOCIAL");
        this.motDesligEsocialAnt = vo.asString("MOTDESLIGESOCIALANT");
        this.natAtividade = vo.asString("NATATIVIDADE");
        this.natAtividadeAnt = vo.asString("NATATIVIDADEANT");
        this.nrInscAprend = vo.asString("NRINSCAPREND");
        this.nrProcTrabAnt = vo.asString("NRPROCTRABANT");
        this.nrProcTrabDeslig = vo.asString("NRPROCTRABDESLIG");
        this.orientacaoSexual = vo.asString("ORIENTACAOSEXUAL");
        this.possuiFilhos = vo.asString("POSSUIFILHOS");
        this.pvd = vo.asString("PVD");
        this.reciboEsocial2200 = vo.asString("RECIBOESOCIAL2200");
        this.reciboEsocial2205 = vo.asString("RECIBOESOCIAL2205");
        this.reciboEsocial2206 = vo.asString("RECIBOESOCIAL2206");
        this.temUsuSnk = vo.asString("TEMUSUSNK");
        this.tpInscAprend = vo.asBigDecimal("TPINSCAPREND");
        this.nrProcTrab = vo.asString("NRPROCTRAB");
        this.observacaoMp = vo.asString("OBSERVACAOMP");
        this.perRedCpu = vo.asBigDecimal("PERREDCPU");
        this.replider = vo.asString("REPLIDER");
        this.salBaseCpu = vo.asBigDecimal("SALBASECPU");
        this.salBaseRed = vo.asBigDecimal("SALBASERED");
        this.suspContrato = vo.asString("SUSPCONTRATO");
        this.dtDispensaPonto = vo.asTimestamp("DTDISPENSAPONTO");
        this.codLocalPonto = vo.asBigDecimal("CODLOCALPONTO");
        this.validado = vo.asString("VALIDADO");
        this.transfSemOnusCedente = vo.asString("TRANSFSEMONUSCEDENTE");
        return this;
   }
}
